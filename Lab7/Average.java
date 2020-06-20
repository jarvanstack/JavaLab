package Git.Gitee.javalab.Lab7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a class called Average according to the UML diagram.
 * This class will allow a user to enter 5 scores into an array. It will then rearrange the data
 * in descending order and calculate the mean for the data set.
 */
public class Average {
    private int[] data;
    private double mean;

    /**
     * –the constructor. It will allocate memory for the array. Use a for loop
     * to repeatedly display a prompt for the user which should indicate that user should
     * Average
     * -data [ ] :int
     * -mean: double
     * +Average( ):
     * +calculateMean( ): void
     * +toString( ): String
     * +selectionSort( ): void
     * enter score number 1, score number 2, etc. Note: The computer starts counting
     * with 0, but people start counting with 1, and your prompt should account for this.
     * For example, when the user enters score number 1, it will be stored in indexed
     * variable 0. The constructor will then call the selectionSort and the
     */
    public Average() {
        //allocate memory for date
        data = new int[5];
        //instantiation of Scanner
        Scanner scanner = new Scanner(System.in);
        //use loop to prompt user enter the int number
        for (int i = 0; i < data.length; i++) {
            System.out.println("please input your " + (i + 1) + " score use int data type.");
            data[i] = scanner.nextInt();
        }
        //call selectionSort and calculateMean methods
        calculateMean();
        selectionSort();
    }

    /**
     * his is a method that uses a for loop to access each score in
     * the array and add it to a running total. The total divided by the number of scores
     * (use the length of the array), and the result is stored into mean.
     */
    public void calculateMean() {
        //define the total number.
        int total = 0;
        //calculate the sum of the data arrays and save it to total
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        //calculate the mean of the data arrays and save it
        mean = total / data.length;
    }

    /**
     * returns a String containing data in descending order and the mean.
     *
     * @return returns a String containing data in descending order and the mean.
     */
    @Override
    public String toString() {
        return "Average{" +
                "data=" + Arrays.toString(data) +
                ", mean=" + mean +
                '}';
    }

    /**
     * this method uses the selection sort algorithm to rearrange
     * the data set from highest to lowest.but I think the insetSort is faster.
     */
    public void selectionSort() {
        int n = data.length - 1;
        for (int i = 0; i < n; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[i]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = data[i];
                data[i] = data[min_index];
                data[min_index] = temp;
            }
        }

    }
}
