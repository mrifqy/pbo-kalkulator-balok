package Main;

import java.awt.event.*;
import javax.swing.*;
import Ruang.Balok;

public class View extends JFrame implements ActionListener {
    JLabel lJudul = new JLabel("KALKULATOR BALOK");
    JLabel lPanjang = new JLabel("Panjang");
    JTextField tfPanjang = new JTextField(15);
    JLabel lLebar = new JLabel("Lebar");
    JTextField tfLebar = new JTextField(15);
    JLabel lTinggi = new JLabel("Tinggi");
    JTextField tfTinggi = new JTextField(15);
    JLabel lHasil = new JLabel("Hasil");
    JLabel lLuas = new JLabel();
    JLabel lKeliling = new JLabel();
    JLabel lLuasPermukaan = new JLabel();
    JLabel lVolume = new JLabel();
    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");

    public View() {
        setTitle("Kalkulator Balok");
        setSize(400, 450);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(tfPanjang);
        add(lLebar);
        add(tfLebar);
        add(lTinggi);
        add(tfTinggi);
        add(lHasil);
        add(lLuas);
        add(lKeliling);
        add(lLuasPermukaan);
        add(lVolume);
        add(btnHitung);
        add(btnReset);

        lJudul.setBounds(135,5,140,30);
        lPanjang.setBounds(100,50,100,20);
        tfPanjang.setBounds(160,50,150,20);
        lLebar.setBounds(100,75,100,20);
        tfLebar.setBounds(160,75,150,20);
        lTinggi.setBounds(100,105,100,20);
        tfTinggi.setBounds(160,105,150,20);
        lHasil.setBounds(190,140,100,30);
        lLuas.setBounds(100,180,250,30);
        lKeliling.setBounds(100,205,250,30);
        lLuasPermukaan.setBounds(100,230,250,30);
        lVolume.setBounds(100,255,250,30);

        btnHitung.setBounds(110,350,80,20);
        btnReset.setBounds(200,350,80,20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int panjang, lebar, tinggi;

        if (e.getSource() == btnHitung) {
            if (tfPanjang.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Panjang tidak oleh kosong.");
            }
            else if (tfLebar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Lebar tidak boleh kosong.");
            }
            else if (tfTinggi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tinggi tidak boleh kosong.");
            }
            else {
                try {
                    panjang = Integer.parseInt(tfPanjang.getText());
                    lebar = Integer.parseInt(tfLebar.getText());
                    tinggi = Integer.parseInt(tfTinggi.getText());

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    lLuas.setText("Luas Persegi Panjang             : " + balok.luas());
                    lKeliling.setText("Keliling Persegi Panjang        : " + balok.keliling());
                    lLuasPermukaan.setText("Luas Permukaan Balok           : " + balok.luasPermukaan());
                    lVolume.setText("Volume Balok                           : " + balok.volume());
                }
                catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Masukkan angka.");
                }
            }
        }

        if (e.getSource() == btnReset) {
            lLuas.setText("");
            lKeliling.setText("");
            lLuasPermukaan.setText("");
            lVolume.setText("");
            tfPanjang.setText("");
            tfLebar.setText("");
            tfTinggi.setText("");
        }
    }
}
