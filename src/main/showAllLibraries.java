package main;

import internal.models.Library;

import javax.swing.*;
import java.util.ArrayList;

import static main.Main.library;

public class showAllLibraries extends JFrame {
    public JPanel showP;
    private JTextArea textArea1;

    public showAllLibraries(){
        ArrayList<Library> libs = library.select.getAllLibraries();
        for (Library lib : libs){
            lib.toStringLib();
        }
    }
}
