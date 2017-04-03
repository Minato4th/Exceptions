package com.endava.service;

/**
 * 4/3/2017
 */
public class Text {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;


    public static final void start(){
        System.out.println("Hello choice one of \n" +
                "1. ArrayIndexOutOfBoundsException \n" +
                "2. FileNotFoundException \n" +
                "3. ClassCastException \n" +
                "4. Random Map exception \n" +
                "5. Recurse Method \n" +
                "6. Exit \n");
    }

    public static final void setIndex(){
        System.out.println("Set position in array and next length of array");
    }

    public static final void setFile(){
        System.out.println("Set file position, (correct dir: src/text.txt)");
    }

    public static final void setCast(){
        System.out.println("Set in what to cast: \n" +
                "1. Integer \n" +
                "2. String \n" +
                "3. Boolean \n");
    }

    public static final void end(){
        System.out.println("The end :)");
    }

    public static final void done(){
        System.out.println("Everything is done well");
    }
}
