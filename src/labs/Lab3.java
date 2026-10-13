package labs;

import java.util.Arrays;
import java.util.Scanner;

// 3.1
public class Lab3 {


   private int arrayStatistics[] = {1, 2, 3, 4, 5, 6};




    void storeStudents ()
    {

        int studentMArks[] = {23, 25, 30, 23, 29};
        int total = 0;
        for (int i = 0; i < studentMArks.length; i++) {
            System.out.println("Student Marks is: " + studentMArks[i]);
            total += studentMArks[i];
        }

        System.out.println("TOtal is " + total);
        System.out.println("Average marks is " + total / studentMArks.length);

    }

    void highAndLow ()
    {



        System.out.println("Total numbers " + arrayStatistics.length);

        int small = arrayStatistics[0];
        int large = arrayStatistics[0];

        for (int arrayStatistic : arrayStatistics) {

            if (arrayStatistic <= small) {
                small = arrayStatistic;

            }

            if (arrayStatistic >= large) {
                large = arrayStatistic;
            }

        }

        System.out.println("Biggest number is " + large);
        System.out.println("Smallest number is " + small);

    }

    void searchArray ()
    {

        System.out.println("Enter a number: ");
        int searcher = new Scanner(System.in).nextInt();

        for (int num : arrayStatistics) {
            if (num == searcher) {
                System.out.println("Number is " + num + " on index " + Arrays.binarySearch(arrayStatistics, num));
                break;
            }

        }


    }

    void separate ()
    {

        int evenOddArray[] = arrayStatistics;

        int even = 0;
        int odd = 0;

        for (int i : evenOddArray) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("Number of odd numbers is " + odd);
        System.out.println("Number of even numbers is " + even);


    }

    void reverse ()
    {
        int sort[] = new int[6];

        for (int i = arrayStatistics.length - 1, j = 0; i >= 0 && j < arrayStatistics.length; i--, j++) {

            sort[j] = arrayStatistics[i];
        }


        System.out.println("Sort is " + Arrays.toString(sort));


    }

}



