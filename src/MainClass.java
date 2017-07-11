import java.util.Scanner;

/**
 * Created by endo on 7/10/2017.
 */
public class MainClass {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double length;
        double width;
        double area;
        double perimeter;
        String answer = "yes";

        do {

            System.out.println("Welcome to Grand Circus's Room Detail Generator!");

            System.out.println("Please enter room length");


            length = scnr.nextDouble();
            scnr.nextLine();

            System.out.println("Please enter room width");


            width = scnr.nextDouble();

            scnr.nextLine();

            area = length * width;

            System.out.println("The area is = " +
                    "" + area + " square feet");


            perimeter = 2 * (length + width);

            // output
            System.out.println("The perimeter is = " + perimeter + " feet");

            System.out.println("Would you like to measure another room?");
            System.out.println("Enter yes to continue");


            answer = scnr.nextLine();
        }
        while (answer.equals("yes"));
    }




}
