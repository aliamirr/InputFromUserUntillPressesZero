import java.util.Scanner;

public class ZeroInputFromUser {

    public static void main(String[] args) {

        double even = 0, odd = 0, sum = 0;
        int counter = 0, input = 0, large = Integer.MIN_VALUE,  small = Integer.MAX_VALUE;

        System.out.print("Enter a series of values (0 to quit): ");
        Scanner in = new Scanner(System.in);

        while ((input = in.nextInt()) != 0) {
            small = Integer.min(small, input); // int small = Integer.MIN_VALUE ; small = Integer.min(int a, int b)
            large = Integer.max(large, input); // int large = Integer.MAX_VALUE ; large = Integer.max(int a, int b)
            sum += input;
            counter++;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (counter > 0 ) {
            double average = sum/counter;
            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
            System.out.println("The total number of integers entered is: " + counter);
            System.out.println("The total even number entered is: " + even);
            System.out.println("The total odd number entered is: " + odd);
            System.out.println("The sum of all the numbers is: " + sum);
            System.out.println("The average value is: " + average);

        } else {
            System.out.println("No data was entered. ");
        }

        }
    }