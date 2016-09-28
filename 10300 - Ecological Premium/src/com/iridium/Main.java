package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder op=new StringBuilder();
        int t,f,budget,area,animals,eco;
        t=scanner.nextInt();
        while(t-- >0){
            f=scanner.nextInt();
            budget=0;
            while(f-- >0){
                area=scanner.nextInt();
                animals=scanner.nextInt();
                eco=scanner.nextInt();
                budget+=area*eco;
            }
            op.append(budget+"\n");
        }
        System.out.println(op.toString());
    }
}
/*
 Input:
 3
 5
 1 1 1
 2 2 2
 3 3 3
 2 3 4
 8 9 2
 3
 9 1 8
 6 12 1
 8 1 1
 3
 10 30 40
 9 8 5
 100 1000 70
 */