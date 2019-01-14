package com.company;

/**
 * Created by bm846 on 1/14/19.
 */
public class TowersOfHanoi {
    public int discNumber = 0;
    public int turns = 0;
    public String test = "";
    public int[][] board;
    public String testBuffer;

    public TowersOfHanoi(int a){

        discNumber = a;
        board = new int[a][2];
        
        for(int b = 0; b < discNumber; b++){
            board[a][0] = a;
        }
    }
    public String testBoard(){
        String c = board;

    }

    public String solveThisJawn() {
        turns++;
        if (turns % 2 == 1){

        }else if (turns % 2 == 0) {

        }

        test = "Turn " + discNumber + ": move " + discNumber + " to space " + discNumber;
        return test;
    }

}
