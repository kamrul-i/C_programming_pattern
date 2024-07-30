package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class C_programming_pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //uper pyramid column print....................
        int num1, col, row;
        System.out.print("Enter any number : ");
        num1 = input.nextInt();

        for (row = num1; row >= 1; row--) {

            for (col = 1; col <= num1 - row; col++) {
                System.out.print("  "); //--------(2)
            }
            for (col = 1; col <= row; col++) {
                System.out.printf("%c ", col + 64); //----(1)
            }
            for (col = row - 1; col >= 1; col--) {
                System.out.printf("%c ", col + 64); //----(1)
            }
            System.out.println();
        }
        System.out.println();
        //uper pyramid column print end ................

        //uper pyramid row print........................
        int num2;
        System.out.print("Enter any number : ");
        num2 = input.nextInt();

        for (row = num2; row >= 1; row--) {

            for (col = 1; col <= num2 - row; col++) {
                System.out.print("  "); //-------(2)
            }
            for (col = 1; col <= row; col++) {
                System.out.printf("%c ", row + 96); //--------(1)
            }
            for (col = row - 1; col >= 1; col--) {
                System.out.printf("%c ", row + 96); //--------(1)
            }
            System.out.println();
        }
        //uper pyramid row print end .................
    }
    
    /*
    উপরোক্ত code দ্বারা Pyramid pattern design (down-part) করা হয়েছে।।
    
    Pattern মুলত C_Programming এর অংশ, যদিও এখানে java-তে code করা হয়েছে।।
    এখানে column print করা হয়েছে, row print করতে চাইলে ১নং সমীকরণে col এর পরিবর্তে row লিখুন।।
    
    ১নং সমীকরণে,
        System.out.printf("%d ", col); এ line use করে ফলাফলে number pattern দেখুন।।
        System.out.printf("%d ", col%2); এ line use করে ফলাফলে binary number দেখুন।।
        System.out.printf("%c ", col+64); এ line use করে ফলাফলে capital character দেখুন।।
        System.out.printf("%c ", col+96); এ line use করে ফলাফলে small character দেখুন।।
        System.out.print("* "); এ line use করে ফলাফলে spacial any character দেখুন।। *(স্টার) এর যায়গায় যা দিবেন, তাই দেখতে পাবেন।।
        যেখানে printf কাজ করবে না, সেখানে print ব্যবহার করুন।।
    
    2নং সমীকরণে, space print করা হয়েছে,
        Left-side যেকোন কিছু design করতে হলে, প্রথমে space print করতে হয়।।
     */
}
