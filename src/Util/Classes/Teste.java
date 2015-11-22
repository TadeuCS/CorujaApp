/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

// Este exemplo mostra como selecionar diretório usando
// JFileChooser a partir de uma JFrame
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Teste extends JFrame {

    public static void main(String[] args) {
        try {
            System.out.println(ManipuladorArquivo.leitor("C:/backup.sql"));
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
