package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class C_programming_pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Odd Diamond style ==================================
        int num, col, row;
        System.out.print("Enter any number : ");
        num = input.nextInt();

        for (row = 1; row <= num; row++) {

            for (col = 1; col <= num - row; col++) {
                System.out.print("  "); //-------(3)
            }
            for (col = 1; col <= 2 * row - 1; col++){ //---------(2)
                System.out.printf("%d ", row % 2);   //----------(1)
            }
            System.out.println();
        }
        //-------------------------------------
        for (row = num-1; row >= 1; row--) {

            for (col = 1; col <= num - row; col++) {
                System.out.print("  "); //-------(3)
            }
            for (col = 1; col <= 2 * row - 1; col++) { //-------(2)
                System.out.printf("%d ", row % 2);  //----------(1)
            }
            System.out.println();
        }
        //Odd Diamond style ==================================
    }

    /*
    উপরোক্ত code দ্বারা Odd Diamond style pattern design. করা হয়েছে।।
    => লক্ষ্য করলে দেখা যায়, পূর্বের প্রায় সকল pyramid কে ‍দুইবার ১নং সমীকরণ নামকরণ করা হয়েছে।।
       সেই দুটি (for loop) condition-কে একসাথে control করা হয়েছে, ২নং সমীকরণে।।
    => লক্ষ্য করলে দেখা যায়, Odd pyramid গুলো প্রত্যেকটি row তার পরবর্তী row-তে দুটি করে input বাড়ে, মানে row-এর input সংখ্যা বিজোড় হসেবে বাড়তে থাকে।।
    
    এখানে row print করা হয়েছে, column print করতে চাইলে ১নং সমীকরণে row এর পরিবর্তে col লিখুন।।
    ১নং সমীকরণে,
        System.out.printf("%d ", col); এ line use করে ফলাফলে number pattern দেখুন।।
        System.out.printf("%d ", col%2); এ line use করে ফলাফলে binary number দেখুন।।
        System.out.printf("%c ", col+64); এ line use করে ফলাফলে capital character দেখুন।।
        System.out.printf("%c ", col+96); এ line use করে ফলাফলে small character দেখুন।।
        System.out.print("* "); এ line use করে ফলাফলে spacial any character দেখুন।। *(স্টার) এর যায়গায় যা দিবেন, তাই দেখতে পাবেন।।
        যেখানে printf কাজ করবে না, সেখানে print ব্যবহার করুন।।

    3নং সমীকরণে, space print করা হয়েছে,
        Left-side যেকোন কিছু design করতে হলে, প্রথমে space print করতে হবে।।
     */
}
