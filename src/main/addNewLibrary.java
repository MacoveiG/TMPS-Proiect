package main;

import internal.models.Library;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.Main.library;

public class addNewLibrary extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    public JPanel addF;

    public addNewLibrary(){
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String location = textField2.getText();
                library.insert.execute(new Library(name,location));
                JOptionPane.showMessageDialog(addButton, "A new library was inserted successfully!");
            }
        });
    }
}
