package com.bridgelabz.Day6;

import java.util.Scanner;

public class Stopwatch {
	public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;


    //main method
    public static void main(String[] args) {
        Stopwatch stw = new Stopwatch(); //create object for Stopwatch class
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        System.out.print("Press any number to Start Time: ");
        a = sc.nextInt();
        stw.setStartTimer();

        System.out.println("--------------------------------------------------");

        System.out.println();
        System.out.print("Press any number to Stop Time: ");
        a = sc.nextInt();
        stw.setStopTimer();

        System.out.println("--------------------------------------------------");


        long l = stw.getelapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is: " +l);
        System.out.println("..................................................");
        System.out.println("Converting Millisec to Seconds : " +(l/1000)+ " sec");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
    }


    //create method to start timer
    public void setStartTimer() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " +startTimer);
    }

    //create method to stop timer
    public void setStopTimer() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " +stopTimer);
    }

    //create method to get Elapsed time
    public long getelapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }
}

