package comp1000_pa1;
// Import Scanner code
import java.util.Scanner;
public class PA1b {
	public static void main(String[] args) {
		Scanner Scan1 = new Scanner(System.in);
		// print message for inches impute
		System.out.println("Enter Inches");
		// this divides the x impute by 36 to get a and takes the remainder numbers and repeats until you are left with just inches.
		int x = Scan1.nextInt();
		int a = x/36;
		int y = x % 36;
		int b = y/12;
		int z = y % 12;
		// print out yards feet and inches
		System.out.println(a+" Yards "+b+" feet "+z+" inches");
	}

}
