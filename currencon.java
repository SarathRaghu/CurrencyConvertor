import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class currencon extends JFrame implements ActionListener {
    JFrame f = new JFrame();
    JLabel l1 = new JLabel("Enter the price in rupees");
    JLabel h=new JLabel("CURRENCY CONVERTOR");
    JLabel l2=new JLabel("Result");
    JTextField t1 = new JTextField();

    String s1[] = { "Dollar", "SaudiRiyal", "OmanRial","Euro"};

    JComboBox<String> c1 = new JComboBox<>(s1);
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Convert");

    public currencon() {

        f.setSize(400, 500);
        f.add(l1);
        f.add(t1);
        f.add(c1);
        f.add(b1);
        f.add(t2);
        f.add(h);
        f.add(l2);
        h.setBounds(100,10,200,50);
        b1.setBounds(150, 350, 100, 25);
        l1.setBounds(100, 50, 200, 25);
        t1.setBounds(80, 80, 200, 25);
        t2.setBounds(80, 350, 200, 25);
        b1.setBounds(130, 250, 100, 25);
        l2.setBounds(160,320,100,20);
        b1.addActionListener(this);
        f.getContentPane().setBackground(Color.lightGray);
        f.setBackground(Color.RED);
        c1.setBounds(80, 130, 200, 30);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (c1.getItemAt(c1.getSelectedIndex()) == "Dollar") {
                double v1 = Double.parseDouble(t1.getText());
                double v2 = 0.012 * v1;
                String d = String.valueOf(v2);
                t2.setText(d);
            }
            if (c1.getItemAt(c1.getSelectedIndex()) == "SaudiRiyal") {
                double v1 = Double.parseDouble(t1.getText());
                double v2 = 0.045 * v1;
                String d = String.valueOf(v2);
                t2.setText(d);
            }
            if (c1.getItemAt(c1.getSelectedIndex()) == "OmanRial") {
                double v1 = Double.parseDouble(t1.getText());
                double v2 = 0.0046 * v1;
                String d = String.valueOf(v2);
                t2.setText(d);
            }
            if (c1.getItemAt(c1.getSelectedIndex()) == "Euro") {
                double v1 = Double.parseDouble(t1.getText());
                double v2 = 0.011 * v1;
                String d = String.valueOf(v2);
                t2.setText(d);
            }
        }
    }

    public static void main(String[] args) {
        new currencon();
    }
}
