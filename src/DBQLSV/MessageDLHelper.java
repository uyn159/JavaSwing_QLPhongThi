/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBQLSV;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class MessageDLHelper {
    public static void showMessageDialog(Component parent,String title,String content){
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorDialog(Component parent,String title,String content){
        JOptionPane.showMessageDialog(parent, title, content, JOptionPane.ERROR_MESSAGE);
    }
    public static int showConfirmDialog(Component parent,String title,String content){
        int choose = JOptionPane.showConfirmDialog(parent, title, content,JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
        return choose;
    }
}
