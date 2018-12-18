package test2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);

        JButton button = new JButton("Click ME");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel,"Welcome To My Application",
                        "Welcome",JOptionPane.INFORMATION_MESSAGE);
            }
        });


        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
