package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class C_programming_pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //---------------------------------------------
        int num1, col, row;
        System.out.print("Enter any number : ");
        num1 = input.nextInt();

        for (row = num1; row >= 1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.printf("%c ", col + 64);  //----------(1)
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
        //---------------------------------------------

        //---------------------------------------------
        int num2;
        System.out.print("Enter any number : ");
        num2 = input.nextInt();

        for (row = num2; row >= 1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.printf("%c ", row + 96);  //----------(1)
            }
            System.out.printf("\n");
        }
        //---------------------------------------------
    }

    /*
    উপরোক্ত code দ্বারা Right-side down, Triangle pattern design করা হয়েছে।।
    
    Pattern মুলত C_Programming এর অংশ, যদিও এখানে java-তে code করা হয়েছে।।
    এখানে column print করা হয়েছে, row print করতে চাইলে ১নং সমীকরণে col এর পরিবর্তে row লিখুন।।
    
    ১নং সমীকরণে,
        System.out.printf("%d ", col); এ line use করে ফলাফলে number pattern দেখুন।।
        System.out.printf("%d ", col%2); এ line use করে ফলাফলে binary number দেখুন।।
        System.out.printf("%c ", col+64); এ line use করে ফলাফলে capital character দেখুন।।
        System.out.printf("%c ", col+96); এ line use করে ফলাফলে small character দেখুন।।
        System.out.print("* "); এ line use করে ফলাফলে spacial any character দেখুন।। *(স্টার) এর যায়গায় যা দিবেন, তাই দেখতে পাবেন।।

        যেখানে printf কাজ করবে না, সেখানে print ব্যবহার করুন।।
    
     */
}
