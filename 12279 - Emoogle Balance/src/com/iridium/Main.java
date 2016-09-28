package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=0,EB,i=0;
        while(scanner.hasNextLine()){
            N=scanner.nextInt();
            EB=0;
            if(N==0)
                break;
            while(N-->0){
                if(scanner.nextInt()==0) EB--;
                else EB++;
            }
            System.out.println("Case "+(++i)+": "+EB);
        }
    }
}
