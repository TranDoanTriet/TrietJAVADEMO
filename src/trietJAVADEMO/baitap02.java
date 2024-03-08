package trietJAVADEMO;

import java.util.Scanner;

public class baitap02 {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		int unit1 = scaner.nextInt();
		System.out.println("nhap chieu rong: ");
		int unit2 = scaner.nextInt();

		int chuvi = (unit1 + unit2) * 2;
		int dientich = unit1 * unit2;
		System.out.println("dien tich: " + dientich + "chu vi: " + chuvi);
	}
}
