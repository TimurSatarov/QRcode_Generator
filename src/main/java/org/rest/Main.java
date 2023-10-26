package org.rest;

import javax.swing.*;
import java.awt.*;
public class GenerateQRcode {


    private static void createAndShowGUI() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("QR Code Generate");

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(new Dimension(300,300));

        frame.add(panel);

        //
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}
