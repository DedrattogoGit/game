/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;



public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator.\nThis is where you use a machine to calculate.");
		  Scanner dude = new Scanner(System.in);
		System.out.println("Choose a number.");
		int a = dude.nextInt();
		  Scanner man = new Scanner(System.in);
		System.out.println("Choose another number.");
		int b = man.nextInt();
		Scanner op = new Scanner(System.in);
		System.out.println("Choose an operation. 1 for X, 2 for /, 3 for +, 4 for -, and 5 for %.");
		int c = op.nextInt();
		if (c == 1) {
		    System.out.println(a);
            System.out.println("x");
            System.out.println(b);
            System.out.println("is");
            System.out.println(a * b);
		}
		if (c == 2) {
		    System.out.println(a);
            System.out.println("/");
            System.out.println(b);
            System.out.println("is");
            System.out.println(a / b);
		}
		if (c == 3) {
		    System.out.println(a);
            System.out.println("+");
            System.out.println(b);
            System.out.println("is");
            System.out.println(a + b);
		}
		if (c == 4) {
		    System.out.println(a);
            System.out.println("-");
            System.out.println(b);
            System.out.println("is");
            System.out.println(a - b);
		}
		if (c == 5) {
		    System.out.println(a);
            System.out.println("%");
            System.out.println(b);
            System.out.println("is");
            System.out.println(a % b);
		}
	}
}

