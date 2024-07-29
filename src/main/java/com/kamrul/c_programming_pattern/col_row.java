package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class col_row {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, col, row;
        System.out.print("Enter any number : ");
        num = input.nextInt();

        for (row = 1; row <= num; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(" " + col * row);
            }
            System.out.println();
        }
    }
    //এখানে col & row কে গুণ করা হয়েছে।।
}
