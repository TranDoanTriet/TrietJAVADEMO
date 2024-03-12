package trietJAVADEMO;

import java.util.Scanner;

public class baitap03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("nhap so b: ");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			float nghiem = (float) -b / a;
			System.out.println("nghiem cua phuong trinh: " + nghiem);
		}

		scanner.close();
	}
}
