package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int hasil = 1;
        int temp1 = 1;
        int temp2 = 1;

        System.out.println("Input:");
        int input = scan.nextInt();

        System.out.println("\nOutput:");
        System.out.print(temp1 + " " + temp2);
        for (int i = 2; i < input; ++i) {
            hasil = temp1 + temp2;
            System.out.print(" " + hasil);
            temp1 = temp2;
            temp2 = hasil;
        }
    }
}
