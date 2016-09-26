package com.iridium;

import java.util.*;


public class Main {


    public static void main(String[] args) {
	// write your code here
        long a,b,t;
        Scanner scr=new Scanner(System.in);
        t=scr.nextLong();
        while(t-->0){
            a=scr.nextLong();
            b=scr.nextLong();

           if (a>b){//No is greater
               System.out.println(">");
           }else if(a<b){//No is smaller
               System.out.println("<");
           }else{// No is equal
               System.out.println("=");


           }
        }

    }
}
