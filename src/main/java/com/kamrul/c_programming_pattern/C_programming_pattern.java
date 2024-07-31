package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class C_programming_pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //==================================
        int num, col, row;
        System.out.print("Enter any number : ");
        num = input.nextInt();

        for (row = num; row >= 2; row--) {

            for (col = 1; col <= num - row; col++) {
                //System.out.print(" ");
                System.out.print("  ");    //----------(2)
            }
            for (col = 1; col <= row; col++) {
                //System.out.print("+ ");  //----------(1)
                System.out.print(" $  ");  //----------(1)
            }
            System.out.println();
        }
        //--------------------------------
        for (row = 1; row <= num; row++) {

            for (col = 1; col <= num - row; col++) {
                //System.out.print(" ");
                System.out.print("  ");    //----------(2)
            }
            for (col = 1; col <= row; col++) {
                //System.out.print("# ");  //----------(1)
                System.out.print(" %  ");  //----------(1)
            }
            System.out.println();
        }
        //==================================
    }

    /*
    উপরোক্ত code দ্বারা Chair style pattern design. করা হয়েছে।।
    => লক্ষ্য করলে দেখা যায়, প্রায় সকল pyramid প্রত্যেকটি row তার পরবর্তী row-তে দুটি করে input বাড়ে।। মানে row-এর input সংখ্যা বিজোড় হিসেবে বাড়তে থাকে।।
    => তবে, এখানে প্রত্যেকটি row তার পরবর্তী row-তে একটি করে input বাড়ে।। মানে row-এর input ক্রমিক সংখ্যা হিসেবে বাড়তে থাকে।।
       এটা মূলত, দুটি input-এর মাঝে একটি space print করে।। 
    
    এখানে column print করা হয়েছে, row print করতে চাইলে ১নং সমীকরণে col এর পরিবর্তে row লিখুন।।
    ১নং সমীকরণে,
        System.out.printf("%d ", col); এ line use করে ফলাফলে number pattern দেখুন।।
        System.out.printf("%d ", col%2); এ line use করে ফলাফলে binary number দেখুন।।
        System.out.printf("%c ", col+64); এ line use করে ফলাফলে capital character দেখুন।।
        System.out.printf("%c ", col+96); এ line use করে ফলাফলে small character দেখুন।।
        System.out.print("* "); এ line use করে ফলাফলে spacial any character দেখুন।। *(স্টার) এর যায়গায় যা দিবেন, তাই দেখতে পাবেন।।
        যেখানে printf কাজ করবে না, সেখানে print ব্যবহার করুন।।

    2নং সমীকরণে, space print করা হয়েছে,
        Left-side যেকোন কিছু design করতে হলে, প্রথমে space print করতে হবে।।
     */
}
