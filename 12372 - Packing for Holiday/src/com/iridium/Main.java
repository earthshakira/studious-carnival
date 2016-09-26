package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt(),i=0;
        int L,W,H;
        while(++i<=T){
            L=scanner.nextInt();
            W=scanner.nextInt();
            H=scanner.nextInt();

            if(L<=20&&W<=20&&H<=20)
                System.out.println("Case "+i+": good");
            else System.out.println("Case "+i+": bad");
        }
    }
}
