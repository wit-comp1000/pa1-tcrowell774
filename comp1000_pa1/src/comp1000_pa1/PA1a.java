package comp1000_pa1;
//import a scanner program.
import java.util.Scanner;

public class PA1a {
	public static void main(String[] args) {
        // Set scanner to detect imputs for yards feet and inches.
        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Enter Yards");
        int x = Scan1.nextInt();
        System.out.println("Enter Feet");
        int y = Scan1.nextInt();
        System.out.println("Enter Inches");
        int z = Scan1.nextInt();
        // add and print out the total inches of imput.
        System.out.println(x*36+y*12+z+" Inches");
    }

}
