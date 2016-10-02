package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        double h,u,d,f,ih;
        int day;
        while(true){
            h=scanner.nextDouble();
            u=scanner.nextDouble();
            d=scanner.nextDouble();
            f=(scanner.nextDouble())*u/100;
            day=1;
            ih=0;
            if(h==0){
                System.out.print(op.toString());
                return;
            }
            while(true){
                if(u>0)
                    ih+=u;
                if(ih>h){
                    op.append("success on day "+day+"\n");
                    break;
                }
                u-=f;
                ih-=d;
                if(ih<0){
                    op.append("failure on day "+day+"\n");
                    break;
                }
                day++;
            }
        }
    }
}

/*
6  3  1  10
10  2  1  50
50  5  3  14
50  6  4  1
50  6  3  1
1  1  1  1
0  0  0  0

50  5  3  14
0  0  0  0
 */
