package main;

import internal.models.Library;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.Main.library;

public class updateLibraryById extends JFrame {
    public JPanel panel1;
    private JTextField textField1;
    private JButton updateButton;

    public updateLibraryById(){
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(library.select.isLibrary(Integer.parseInt(textField1.getText()))){
                    updateLibrary updL = new updateLibrary();
                    updL.setContentPane(updL.panel1);
                    updL.setSize(300, 200);
                    updL.setVisible(true);
                    updL.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                }else {
                    JOptionPane.showMessageDialog(updateButton,"\tThis library id does not exist");
                }
            }
        });
    }
}
