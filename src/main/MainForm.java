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
    public JPanel mainMenu;

    public MainForm() {
        showAllLibrariesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAllLibraries show = new showAllLibraries();
                show.setContentPane(show.showP);
                show.setSize(300, 500);
                show.setVisible(true);
                show.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        addNewLibraryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewLibrary addL = new addNewLibrary();
                addL.setContentPane(addL.addF);
                addL.setSize(300, 200);
                addL.setVisible(true);
                addL.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        updateLibraryByIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLibraryById uppB = new updateLibraryById();
                uppB.setContentPane(uppB.panel1);
                uppB.setSize(300, 150);
                uppB.setVisible(true);
                uppB.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
        deleteLibraryByIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteLibraryById dell = new deleteLibraryById();
                dell.setContentPane(dell.panel1);
                dell.setSize(300, 150);
                dell.setVisible(true);
                dell.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }
        });
    }
}
