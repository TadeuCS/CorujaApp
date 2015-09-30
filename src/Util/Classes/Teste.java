/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Classes;

// Este exemplo mostra como selecionar diretório usando
// JFileChooser a partir de uma JFrame
import javax.swing.*;
import java.io.*;

public class Teste extends JFrame {

    private String getDiretorioDestino(String nome) {
        String diretorio = null;
        try {
            JFileChooser fc = new JFileChooser();
            // restringe a amostra a diretorios apenas
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            int res = fc.showOpenDialog(null);
            if (res == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                diretorio = file.getAbsolutePath()+File.separator + nome + ".pdf";
                diretorio = diretorio.replace("\\", "/");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar um diretório para salvar os contratos!\n" + e);
        }
        return diretorio;
    }
    public static void main(String[] args) {
        Teste t = new Teste();
        System.out.println(t.getDiretorioDestino("teste"));
        
    }
}
