
package com.mycompany.project;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.swing.plaf.ColorUIResource;

public class Project {
	public static void main(String args[]) {
            
            UIManager uim=new UIManager();
            uim.put("Panel.background",new ColorUIResource(0,200,250));
                
		String choice;               
                while (true){
		choice = JOptionPane.showInputDialog("""
                                                   Please Select Operator (1-9):
                                                    1. Addidtion 
                                                    2. Subtraction 
                                                    3. Multiplication 
                                                    4. Division 
                                                    5. Square Root
                                                    6. Decimal to Binary
                                                    7. Decimal to Hexa
                                                    8. Decimal to Octal
                                                    9. Exit
                                                     """);
                     
                switch (choice) {
                        case "1":
                              String no1_add = 
                              JOptionPane.showInputDialog("Enter Value 1");
                              String no2_add =
                              JOptionPane.showInputDialog("Enter Value 2");

                              int add1 = Integer.parseInt(no1_add); 
                              int add2 = Integer.parseInt(no2_add);
                              int sum = add1 + add2;

                              JOptionPane.showMessageDialog(null, "Result: " + sum, 
                         "Addition", JOptionPane.PLAIN_MESSAGE);
                                break;
                                
                        case "2":
                              String no1_minus = 
                              JOptionPane.showInputDialog("Enter Value 1");
                              String no2_minus =
                              JOptionPane.showInputDialog("Enter Value 2");

                              int minus1 = Integer.parseInt(no1_minus);
                              int minus2 = Integer.parseInt(no2_minus);
                              int minuend = minus1 - minus2;

                              JOptionPane.showMessageDialog(null, "Result: " + minuend,
                         "Subtraction", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                        case "3":
                              String no1_times =
                              JOptionPane.showInputDialog("Enter Value 1");
                              String no2_times =
                              JOptionPane.showInputDialog("Enter Value 2");

                              int times1 = Integer.parseInt(no1_times);
                              int times2 = Integer.parseInt(no2_times);
                              int product = times1 * times2;

                              JOptionPane.showMessageDialog(null, "Result: " + product,
                         "Multiplication", JOptionPane.PLAIN_MESSAGE);
                              break;
                             
                         case "4":
                              String no1_divide =
                              JOptionPane.showInputDialog("Enter Value 1");
                              String no2_divide =
                              JOptionPane.showInputDialog("Enter Value 2");

                              int divide1 = Integer.parseInt(no1_divide);
                              int divide2 = Integer.parseInt(no2_divide);
                              int quotient = divide1 / divide2;
                              JOptionPane.showMessageDialog(null, "Result: " + quotient,
                         "Division", JOptionPane.PLAIN_MESSAGE);         
                              break;
                             
                         case "5":   
                             String square =
                             JOptionPane.showInputDialog("Enter Value");
                             
                              int  root = Integer.parseInt(square);                             
                              JOptionPane.showMessageDialog(null, "Result: "+ Math.sqrt(root),
                         "Square Root", JOptionPane.PLAIN_MESSAGE); 
                              break;
                              
                         case "6":   
                             String decimal =
                             JOptionPane.showInputDialog("Enter Value");
                             
                             int  decimals = Integer.parseInt(decimal);                             
                             JOptionPane.showMessageDialog(null, "Result: "+ Integer.toBinaryString(decimals),
                        "Square Root", JOptionPane.PLAIN_MESSAGE); 
                             break;
                              
                  
                         case "7":   
                             String decimal_1 =
                              JOptionPane.showInputDialog("Enter Value");
                             
                              int  decimals_1 = Integer.parseInt(decimal_1);                             
                              JOptionPane.showMessageDialog(null, "Result: "+ Integer.toHexString(decimals_1),
                         "Hexadecimal", JOptionPane.PLAIN_MESSAGE); 
                              break;
                              
                        case "8":   
                              String decimal_2 =
                              JOptionPane.showInputDialog("Enter Value");
                             
                              int  decimals_2 = Integer.parseInt(decimal_2);                             
                              JOptionPane.showMessageDialog(null, "Result: "+ Integer.toOctalString(decimals_2),
                         "Octal", JOptionPane.PLAIN_MESSAGE); 
                              break;  
                              
                        case "9":
                                JOptionPane.showMessageDialog(null,"Exiting Program...");
                                System.exit(0);
                                break;
                        default:
                           JOptionPane.showMessageDialog(null,"Invalid Entry...");
                           break;
                    }
       
}
        
}
}