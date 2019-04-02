package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int hasil;
        int temp1 = 1;
        int temp2 = 1;
        ArrayList reverse = new ArrayList();
        reverse.add(temp1);
        reverse.add(temp2);

        System.out.println("Input:");
        int input = scan.nextInt();

        System.out.println("\nOutput:");
        for (int i = 2; i < input; ++i) {
            hasil = temp1 + temp2;
            temp1 = temp2;
            temp2 = hasil;
            reverse.add(hasil);
        }
        for (int i = reverse.size()-1; i >= 0; i--) {
            System.out.print(reverse.get(i) + " ");
        }
    }
}
