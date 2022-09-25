package comp1000_pa1;

import java.util.Scanner;

public class PA1a {
	public static void main(String[] args) {
        int Yard = 36*1;
        int Feet = 12*1;
        int inches = 1*1;
        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Enter Yards");
        int x = Scan1.nextInt();
        System.out.println("Enter Feet");
        int y = Scan1.nextInt();
        System.out.println("Enter Inches");
        int z = Scan1.nextInt();
        System.out.println(x*36+y*12+z+" Inches");
    }

}
