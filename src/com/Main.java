package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame;
    private JTable table;

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 869, 523);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnfile = new JButton("File");
        btnfile.setBounds(0, 0, 59, 23);
        frame.getContentPane().add(btnfile);

        JButton btnsource = new JButton("Source");
        btnsource.setBounds(110, 0, 75, 23);
        frame.getContentPane().add(btnsource);

        JButton btnrefac = new JButton("Refactor");
        btnrefac.setBounds(183, 0, 88, 23);
        frame.getContentPane().add(btnrefac);

        JButton btnNewButton = new JButton("Help");
        btnNewButton.setBounds(638, 0, 59, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Window");
        btnNewButton_1.setBounds(558, 0, 82, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Run");
        btnNewButton_2.setBounds(503, 0, 65, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Project");
        btnNewButton_3.setBounds(430, 0, 75, 23);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("Search");
        btnNewButton_4.setBounds(356, 0, 75, 23);
        frame.getContentPane().add(btnNewButton_4);

        JButton btnnavigate = new JButton("Navigate");
        btnnavigate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnnavigate.setBounds(269, 0, 88, 23);
        frame.getContentPane().add(btnnavigate);

        JButton btnNewButton_5 = new JButton("Edit");
        btnNewButton_5.setBounds(54, 0, 59, 23);
        frame.getContentPane().add(btnNewButton_5);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(183, 23, 514, 450);
        frame.getContentPane().add(textPane);

        JButton btnNewButton_7 = new JButton("Recent files");
        btnNewButton_7.setBounds(0, 23, 185, 34);
        frame.getContentPane().add(btnNewButton_7);

        JButton btnNewButton_8 = new JButton("Import");
        btnNewButton_8.setBounds(0, 57, 185, 34);
        frame.getContentPane().add(btnNewButton_8);

        JButton btnNewButton_9 = new JButton("Export");
        btnNewButton_9.setBounds(0, 91, 185, 34);
        frame.getContentPane().add(btnNewButton_9);

        table = new JTable();
        table.setBounds(800, 91, 1, 1);
        frame.getContentPane().add(table);

        JEditorPane dtrpnSearchBar = new JEditorPane();
        dtrpnSearchBar.setText("Search bar");
        dtrpnSearchBar.setBounds(702, 0, 141, 20);
        frame.getContentPane().add(dtrpnSearchBar);
    }
}
