package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        long n,t;
        t=scanner.nextLong();
        while(t-->0){
            System.out.println(Math.abs(((scanner.nextLong()*315)+36962)%100)/10);
        }
    }
}
