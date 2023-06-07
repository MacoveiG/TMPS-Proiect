package main;

import internal.models.Library;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static main.Main.library;

public class MainForm extends JFrame {
    private JLabel main_menu;
    private JButton showAllLibrariesButton;
    private JButton selectLibraryByIdButton;
    private JButton addNewLibraryButton;
    private JButton updateLibraryByIdButton;
    private JButton deleteLibraryByIdButton;
    private JButton exitButton;
    public JPanel mainMenu;

    public MainForm() {
        showAllLibrariesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAllLibraries show = new showAllLibraries();
                show.setContentPane(show.showP);
                show.setSize(300, 250);
                show.setVisible(true);
                show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
