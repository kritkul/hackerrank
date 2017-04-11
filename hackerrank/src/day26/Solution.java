package day26;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int da = in.nextInt();
		int ma = in.nextInt();
		int ya = in.nextInt();

		int de = in.nextInt();
		int me = in.nextInt();
		int ye = in.nextInt();

		in.close();

		int yearLate = ya - ye;
		int monLate = ma - me;
		int dayLate = da - de;

		System.out.println((yearLate > 0) ? 10000
				: (monLate > 0) && (yearLate == 0) ? monLate * 500 : (dayLate > 0) && (yearLate == 0) ? dayLate * 15 : 0

		);

		 int fine = calculateFine(da,ma,ya,de,me,ye);
		 System.out.println("in real life, fine is : " + fine);

	}

	private static int calculateFine(int da, int ma, int ya, int de, int me, int ye) {
		int fine = 0;

		int actual = da + (ma * 100) + (ya * 10000);
		int expect = de + (me * 100) + (ye * 10000);

		int tmp = actual - expect;


		if (tmp > 10000) {
			fine = 10000;
		} else if (tmp > 100 && tmp <= 10000) {
			if (ma < me) {
				fine = ((da + getTotalDayInMonth(ma,ya)) - de) * 15;
			} else {
				fine = (ma - me) * 500;
			}
		} else {
			fine = tmp * 15;
		}

		return fine;
	}

	private static int getTotalDayInMonth(int ma,int ya) {
		String cp = Integer.toString(ma);

		String thirty[] = { "4", "6", "9", "11" };

		if (thirty.equals(cp)) {
			return 30;
		} else if ("2".equals(cp)) {
			return isLeapYear(ya)? 29 : 28;
		}

		return 31;
	}

	public static boolean isLeapYear(int year) {

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}

}
