package trietJAVADEMO;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("so dau tien: ");
		int s1 = scanner.nextInt();
		System.out.println("so thu 2: ");
		int s2 = scanner.nextInt();
		System.out.print(Math.sqrt(s1));
		scanner.close();
	}
}
