package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        String x;
        while(T-->0){
            x=scanner.next();
            if(x.equals("1")||x.equals("4")||x.equals("78"))
                System.out.println("+");
            else if(x.substring(x.length()-2).equals("35"))
                System.out.println("-");
            else if(x.charAt(0)=='9' && x.charAt(x.length()-1)=='4')
                System.out.println("*");
            else if(x.substring(0,3).equals("190"))
                System.out.println("?");
        }
    }
}
