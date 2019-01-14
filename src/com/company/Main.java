package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Tower of Hanoi Game.");
    System.out.println("This program will solve the puzzle for you");
    System.out.println("Please input the number of discs to solve for:");

    try{
        Scanner kbsreader = new Scanner(System.in);
        int disc = kbsreader.nextInt();
    }catch (InputMismatchException e){

        Scanner kbsreader = new Scanner(System.in);
        int disc = kbsreader.nextInt();
    }


    TowersOfHanoi towerBoi = new TowersOfHanoi(3);
    towerBoi.solveThisJawn();
    }
}
