package automproject;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AutomProject {

    public static void main(String[] args) {
        showFrame(new PanClass());
    }

    public static void showFrame(JPanel panel) {
        JFrame frame = new JFrame("Accepting a string that ends with \"ing\"");
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocation(450, 250);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
