package automproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class PanClass extends JPanel {

    JLabel label_1;
    JTextField txt;
    Font font;
    JButton btn;
   

    public PanClass() {
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
        label_1 = new JLabel("Enter String here ! ");
        label_1.setBounds(130, 5, 200, 20);
        this.add(label_1);
        txt = new JTextField();
        txt.setBounds(90, 35, 200, 30);
        font = new Font(Font.SANS_SERIF, 22, 22);
        txt.setFont(font);
        this.add(txt);
        btn = new JButton("Check !");
        btn.setBounds(140, 85, 95, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                check();
            }
        });
        this.add(btn);

    }

    public void check() {
        if ((txt.getText()).endsWith("ing")) {
            JOptionPane.showMessageDialog(null, "saw ing \n String Accepted !");
        } else if ((txt.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Null String !");
        } else {
            if ((txt.getText()).endsWith("i")) {
                JOptionPane.showMessageDialog(null, "Saw i ");
            } else if ((txt.getText()).endsWith("in")) {
                JOptionPane.showMessageDialog(null, "Saw in ");
            } else {
                JOptionPane.showMessageDialog(null, "String rejected !");
            }
        }
    }

}
