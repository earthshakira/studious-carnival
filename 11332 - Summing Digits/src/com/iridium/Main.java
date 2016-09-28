package com.iridium;

import java.util.Scanner;

public class Main {

    static long f(long g){
        if(g<10)
            return g;
        long sum=0;
        while(g>0){
            sum+=g%10;
            g/=10;
        }
        return f(sum);
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        long n;
        do{
            n=scanner.nextLong();
            if(n!=0)
                System.out.println(f(n));
        }while(n!=0);
    }
}
/*

2
11
47
1234567892
0

 */