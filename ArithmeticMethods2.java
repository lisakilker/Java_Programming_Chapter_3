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
public class ArithmeticMethods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String userFirstNumber;
        String userSecondNumber;
        int firstNumber;
        int secondNumber;
        
        userFirstNumber = JOptionPane.showInputDialog(null, "Give me a number? ");
        userSecondNumber = JOptionPane.showInputDialog(null, "Give me another number? ");
        
        firstNumber = Integer.parseInt(userFirstNumber);
        secondNumber = Integer.parseInt(userSecondNumber);
        
        displayNumberPlus10(firstNumber);
        displayNumberPlus10(secondNumber);
        displayNumberPlus100(firstNumber);
        displayNumberPlus100(secondNumber);
        displayNumberPlus1000(firstNumber);
        displayNumberPlus1000(secondNumber);
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
