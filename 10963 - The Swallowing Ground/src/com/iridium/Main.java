package com.iridium;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner= new Scanner(System.in);
        StringBuilder op=new StringBuilder();
        int t,c,s,f,diff;
        boolean gap;
        t=scanner.nextInt();
        while (t--> 0){
            c=scanner.nextInt();
            if(c==0){
                op.append("yes\n");
                if(t>0)op.append("\n");
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
            op.append(((gap)?"no\n":"yes\n"));
            if(t>0)op.append("\n");
        }
        System.out.print(op.toString());
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