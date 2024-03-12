package chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Video30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> arr = new ArrayList<Double>();
		while (true) {
			System.out.println("nhap vao mot so thuc: ");
			double a = scan.nextDouble();
			arr.add(a);
			scan.nextLine();// enter
			System.out.println("continue??");
			String option = scan.nextLine();
			if (option.equals("y")) {
				continue;
			}
			if (option.equals("n")) {
				break;
			}
		}
		double outNumber = 0;
		for (int i = 0; i < arr.size(); i++) {
			outNumber += arr.get(i);
		}
		System.out.println(outNumber);
		scan.close();

	}
}
