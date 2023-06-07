package main;

import internal.models.Library;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import static main.Main.library;

public class showAllLibraries extends JFrame {
    public JPanel showP;
    public JTextArea textArea1;

    public showAllLibraries(){
        ArrayList<Library> libs = library.select.getAllLibraries();
        for (Library lib : libs){
            textArea1.append("Id : \t " + lib.getId() + "\n");
            textArea1.append("Name: \t "+ lib.getName() + "\n");
            textArea1.append("Location: \t" + lib.getLocation() + "\n");
            textArea1.append("Nr of users: \t " + lib.getNrUsers() + "\n");
            textArea1.append("Nr of books: \t " + lib.getNrBooks() + "\n");
            textArea1.append("\n");
        }
    }
}
