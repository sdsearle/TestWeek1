package com.example.admin.testweek1;

import java.util.ArrayList;

/**
 * Created by admin on 9/1/2017.
 */

public class Test {
    public static void main(String[] args) {
        String s = "racecar";
        ArrayList<Integer> myInts = new ArrayList<>();
        myInts.add(1);
        myInts.add(2);
        myInts.add(3);
        myInts.add(4);
        myInts.add(6);
        myInts.add(6);
        myInts.add(6);
        myInts.add(8);
        myInts.add(9);
        MySingleton singleton = null;
        isPalindrome(s);

        singleton = createSingleton(singleton);

        mostOccuring(myInts);

        int armstrong = 1;
        isArmstrong(armstrong);

    }

    //ArmStrong
    private static void isArmstrong(int armstrong) {
        String tmp = ""+armstrong;
        int total = 0;
        for (int i = 0; i < tmp.length(); i++){
            total += Math.pow(Integer.parseInt(String.valueOf(tmp.charAt(i))),tmp.length());
        }
        if(total == armstrong){
            System.out.println(armstrong + " is Armstrong number");
        }
        else System.out.println(armstrong + " is NOT Armstrong number");

        System.out.println();
    }

    //Most Occuring Number
    private static void mostOccuring(ArrayList<Integer> myInts) {
        ArrayList<Integer> tmp = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i: myInts
             ) {
            if(tmp.isEmpty()){
                tmp.add(i);
                count.add(1);
            }
            else{
                if(tmp.contains(i)){
                    count.set(tmp.indexOf(i), count.get(tmp.indexOf(i))+1);
                }
                else{
                    tmp.add(i);
                    count.add(1);
                }
            }
        }
        int max = 0;
        for (int i: count
             ) {
            if (i > max) {
                max = i;
            }
        }
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i =0; i < count.size(); i++) {
            if(count.get(i) == max){
                ints.add(tmp.get(i));
            }

        }

        System.out.println("Most common numbers "+ ints.toString());
        System.out.println();
    }

    //Singleton
    private static MySingleton createSingleton(MySingleton singleton) {
        if(singleton == null){
            return new MySingleton();
        }
        else return singleton;
    }

    //Palindrome
    private static void isPalindrome(String s) {
        int size = s.length()-1;
        boolean isPalin = true;
        for(int i = 0; i < size/2; i++){
            if(s.charAt(i) != s.charAt(size-i)){
                isPalin = false;
                break;
            }
        }
        if (isPalin){
            System.out.println(s + " is a palindrome");
        }
        else System.out.println(s + " is NOT a palindrome");

        System.out.println();
    }
}
