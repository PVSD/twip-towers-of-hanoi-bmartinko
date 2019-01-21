package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Tower of Hanoi Game.");
    System.out.println("This program will solve the puzzle for you");
    System.out.println("Please input the number of discs to solve for:");

    Scanner kb = new Scanner(System.in);
    int disc = kb.nextInt();

        System.out.println("Here are the steps necessary to figure complete Tower Of Hanoi with " + disc + " discs!");
    towerOfHanoi(disc, 'A', 'B', 'C' );
    }
    static void towerOfHanoi(int n, char start, char mid, char end){
        if(n==1){
            System.out.println("Move disc 1 from rod " + start + " to rod " + end);
        }else{
            towerOfHanoi(n-1, start, end, mid);
            System.out.println("Move disc " + n + " from rod " + start + " to rod " + end);
            towerOfHanoi(n-1, mid, start, end);
        }
    }
}
