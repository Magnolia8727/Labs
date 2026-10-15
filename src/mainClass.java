import labs.lab4.BankAccount;
import labs.lab4.Rectangle;
import labs.lab4.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {

    static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int option = Integer.parseInt( JOptionPane.showInputDialog( "Wanna work with Student = 1 or Bank Account = 2 or Rectangle = 3 or 0 to Exit"));


      if (option == 1) {
          JOptionPane.showMessageDialog(null, "Student it is");
          String name = JOptionPane.showInputDialog("Enter Student Name: ");
          String studentNumber = JOptionPane.showInputDialog("Enter Student Number: ");
          int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the mark u received: "));


          Student st = new Student(name, studentNumber, mark);

          JOptionPane.showMessageDialog(null, "Student created\n" + st.toString());


          if (st.hasPassed()) {
              JOptionPane.showMessageDialog(null, "You got " + st.getMark() + " hence ur not a moron");
          } else {
              JOptionPane.showMessageDialog(null, "You got " + st.getMark() + " hence ur a moron");


          }

          String newName = JOptionPane.showInputDialog("Am tired jst set a new name for urself: ");

          st.setName(newName);

          String newSt = JOptionPane.showInputDialog("Am tired jst set a new student number for urself: ");

          st.setStudentNumber(newSt);

          int newMark = Integer.parseInt(JOptionPane.showInputDialog("Am tired jst set a new  mark for urself: "));


          st.setMark(newMark);

          JOptionPane.showMessageDialog(null, "Here are ur details : \n" + st.toString());

      }
      else if (option == 2) {
          JOptionPane.showMessageDialog(null, "Bank Account it is");

          String accHolder =  JOptionPane.showInputDialog("Enter Account Holder: ");
          String accountNumber = JOptionPane.showInputDialog("Enter Account Number: ");
          double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Initial Balance: "));

          BankAccount bk = new BankAccount(accountNumber,balance,accHolder);

          JOptionPane.showMessageDialog(null, "Bank Account created successfully\nWelcome\n" + bk.toString());

      }
      else if (option == 3)
      {
          JOptionPane.showMessageDialog(null, "Rectangle it is");

          double height  = Double.parseDouble(JOptionPane.showInputDialog("Enter height  of a Rectangle: "));
          double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width of a Rectangle: "));

          Rectangle rect = new Rectangle(width,height);

          JOptionPane.showMessageDialog(null, "Rectangle created\n" + rect.toString());

          JOptionPane.showMessageDialog(null, "Area of Rectangle is : " + rect.calculateArea());

          JOptionPane.showMessageDialog(null, "Parameter of Rectangle is : " + rect.calculatePerimeter());

      }
      else if (option == 0)
      {

          JOptionPane.showMessageDialog(null, "Exiting Program");
          System.exit(0);
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Please enter a valid option");
      }










    }


}
