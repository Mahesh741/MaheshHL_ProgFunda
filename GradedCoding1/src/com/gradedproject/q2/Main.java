package com.gradedproject.q2;

import java.util.Scanner;

public class Main {

	int power(int x, int N) {
		if (N == 0) {
			return 1;
		}
		return x * power(x, N - 1);
	}

	public static void main(String[] args) {
		Main m = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number X:");
		int X = sc.nextInt();
		System.out.print("Enter the power N = ");
		int N = sc.nextInt();
		System.out.println("X power N is: " + m.power(X, N));
		sc.close();

	}

}
