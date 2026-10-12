import javax.swing.*;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

// 3.1
public class Lab3 {

    static void main(String[] args) {

      int studentMArks [] = {23 , 25 , 30 , 23, 29};
      int total = 0;
      for ( int i = 0 ; i < studentMArks.length ; i++)
      {
          System.out.println("Student Marks is: " + studentMArks[i]);
          total += studentMArks[i];
      }

        System.out.println("TOtal is " + total );
        System.out.println("Average marks is " + total / studentMArks.length);



        // 3.2

        int arrayStatistics [] = { 1,2,3,4,5,6};

        System.out.println("Total numbers " + arrayStatistics.length);

        int small = arrayStatistics[0];
        int large = arrayStatistics[0];

        for (int arrayStatistic : arrayStatistics) {

            if (arrayStatistic <= small) {
                small = arrayStatistic;

            }

            if (arrayStatistic >= large ) {
                large = arrayStatistic;
            }

        }

        System.out.println("Biggest number is " + large);
        System.out.println("Smallest number is " + small);


        //3.3 Array Search


        System.out.println("Enter a number: ");
        int searcher = new Scanner(System.in).nextInt();

        for (int num : arrayStatistics)
        {
            if (num == searcher)
            {
                System.out.println("Number is " + num + " on index "  );
            }

        }





    }



}



