package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class Floyd_triangle_num {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, col, row, count = 0;
        System.out.print("Enter any number : ");
        num = input.nextInt();

        for (row = 1; row <= num; row++) {

            for (col = 1; col <= row; col++) {
                System.out.printf("%d ", ++ count);
            }
            System.out.printf("\n");
        }
    }
    //Floyd মানে হলো ক্রমিক number. যতো input দিবেন, ততো line ক্রমিক number print করবে।।
}
