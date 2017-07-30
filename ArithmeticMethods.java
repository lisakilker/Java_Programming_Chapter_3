/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2HW;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisa
 */
public class ArithmeticMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int firstNum = 5;
        int secondNum = 10;
        
        displayNumberPlus10(firstNum);
        displayNumberPlus10(secondNum);
        displayNumberPlus100(firstNum);
        displayNumberPlus100(secondNum);
        displayNumberPlus1000(firstNum);
        displayNumberPlus1000(secondNum);
    }
    
    public static void displayNumberPlus10(int number){
        JOptionPane.showMessageDialog(null, number + 10);
    }
    public static void displayNumberPlus100(int number){
        JOptionPane.showMessageDialog(null, number + 100);
    }
    public static void displayNumberPlus1000(int number){
        JOptionPane.showMessageDialog(null, number + 1000);
    }
}
