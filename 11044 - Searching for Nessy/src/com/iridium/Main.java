package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int t,n,m,c,r;
        t=scanner.nextInt();
        while(t-->0){
            n=scanner.nextInt();
            m=scanner.nextInt();
            System.out.println(m/3*n/3);
        }

    }
}
