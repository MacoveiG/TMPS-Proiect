package main;

import internal.models.Library;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.Main.library;

public class updateLibrary extends JFrame {
    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton updateButton;
    private JTextField textField3;

    public updateLibrary(){
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField3.getText());
                String name = textField1.getText();
                String location = textField2.getText();
                library.update.execute(new Library(id, name, location));
                JOptionPane.showMessageDialog(updateButton, "An existing library was updated successfully!");
            }
        });
    }
}
