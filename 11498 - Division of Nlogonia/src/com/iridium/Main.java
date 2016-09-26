package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scr=new Scanner(System.in);
        long k,m,n,x,y;
        k=scr.nextLong();
        n=scr.nextLong();
        m=scr.nextLong();

        while(k>0){
            x=scr.nextLong();
            y=scr.nextLong();
            System.out.println(new Solve().solve(n,m,x,y));
            k--;
        }
    }
}

class Solve{

    String solve(long n,long m,long x,long y){
        StringBuilder opstr=new StringBuilder();
        long tx=x-n,ty=y-m;
        if(tx==0||ty==0)
            return "divisa";
        opstr.append((ty>0)?"N":"S");
        opstr.append((tx>0)?"E":"O");
        return  opstr.toString();
    }
}