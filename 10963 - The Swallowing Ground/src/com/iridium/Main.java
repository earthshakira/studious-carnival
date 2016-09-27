package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner= new Scanner(System.in);
        int t,c,s,f,diff;
        boolean gap;
        t=scanner.nextInt();
        while (t--> 0){
            c=scanner.nextInt();
            if(c==0){
                System.out.println("yes");
                continue;
            }
            gap=false;
            s=scanner.nextInt();
            f=scanner.nextInt();
            diff=s-f;
            while(--c >0){
                s=scanner.nextInt();
                f=scanner.nextInt();
                if(diff!=(s-f))
                    gap=true;
            }
            System.out.println(((gap)?"no":"yes"));
        }

    }
}
/*
input:
1
5
2 1
0 -1
1 0
1 0
2 1
 */