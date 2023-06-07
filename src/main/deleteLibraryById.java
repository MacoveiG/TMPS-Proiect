package main;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.Main.library;

public class deleteLibraryById extends JFrame {
    public JPanel panel1;
    private JTextField textField1;
    private JButton deleteButton;

    public deleteLibraryById(){
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(library.select.isLibrary(Integer.parseInt(textField1.getText()))){
                    library.delete.execute(library.select.selectLibByID(Integer.parseInt(textField1.getText())));
                    JOptionPane.showMessageDialog(deleteButton, "Library is deleted");
                }else {
                    JOptionPane.showMessageDialog(deleteButton, "This library id does not exist");
                }
            }
        });

    }
}
