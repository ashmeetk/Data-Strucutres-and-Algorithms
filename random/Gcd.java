package random;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(gcd(a, b));

	}

	public static int gcd(int a, int b) {
		int i=1;
		int gcd=1;
		while(i<=a&&i<=b) {
			if(a%i==0&&b%i==0)
				gcd=i;
			i++;
		}
		return gcd;
	}

}
