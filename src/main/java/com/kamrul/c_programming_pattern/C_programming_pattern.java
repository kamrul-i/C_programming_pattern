package com.kamrul.c_programming_pattern;
import java.util.Scanner;
public class C_programming_pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //=========================================
        int num, col, row;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        
        for ( row = 1; row <=num; row++) {
            for ( col = 1; col <=num; col++) {
                System.out.print("& "); //--------(1)  //spacial character-এ row/col এর প্রয়োজন নেই।।
            }
            System.out.printf("\n");
        }
        //=========================================
    }

    /*
    উপরোক্ত code দ্বারা Square diamond pattern design. করা হয়েছে।।
    
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
