package com.deadinside;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("You want to die?");
        Scanner in = new Scanner(System.in);
        System.out.print("1 - yes, 2 - no   ");
        int num = in.nextInt();
        int start=1000;

            if (num == 1){
                while (start>0){
                    int finish = start;
                    start = start - 7;
                    System.out.println(finish + " - 7" + " = " + start);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (start<0) {
                        break;
                    }
                }
            }else if (num == 2){
                System.out.println("You're so weak...");
            }else{
                System.out.println("Useless");
            }

    }
}
