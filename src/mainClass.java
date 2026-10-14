import labs.lab4.BankAccount;
import labs.lab4.Student;

import javax.swing.*;
import java.util.Scanner;

public class mainClass {

    static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int option = Integer.parseInt( JOptionPane.showInputDialog( "Wanna work with Student = 1 or Bank Account = 2"));


      if (option == 1) {
          JOptionPane.showMessageDialog(null, "Student it is");
          String name = JOptionPane.showInputDialog("Enter Student Name: ");
          String studentNumber = JOptionPane.showInputDialog("Enter Student Number: ");
          int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter the mark u received: "));


          Student st = new Student(name, studentNumber, mark);

          System.out.println("Welcome");
          st.displayDetails();

          if (st.hasPassed()) {
              JOptionPane.showMessageDialog(null, "Student not moron ");
          } else {
              JOptionPane.showMessageDialog(null, "Student moron");


          }

          String newName = JOptionPane.showInputDialog("Am tired jst set a new name for urself: ");

          st.setName(newName);

          String newSt = JOptionPane.showInputDialog("Am tired jst set a new student number for urself: ");

          st.setStudentNumber(newSt);

          int newMark = Integer.parseInt(JOptionPane.showInputDialog("Am tired jst set a new  mark for urself: "));


          st.setMark(newMark);

          JOptionPane.showMessageDialog(null, "Here are ur details Moron: \n" + st.toString());

      }
      else if (option == 2) {
          JOptionPane.showMessageDialog(null, "Bank Account it is");

          String accHolder =  JOptionPane.showInputDialog("Enter Account Holder: ");
          String accountNumber = JOptionPane.showInputDialog("Enter Account Number: ");
          double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Initial Balance: "));

          BankAccount bk = new BankAccount(accountNumber,balance,accHolder);

          JOptionPane.showMessageDialog(null, "Bank Account created successfully\nWelcome\n" + bk.toString());

      }
      else {
          JOptionPane.showMessageDialog(null, "Please enter a valid option");
      }

    }


}
