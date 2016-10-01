package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        int t,n,i,sp,p;
        String inst;
        boolean m[];
        t=scanner.nextInt();
        while(t-->0){
            n=scanner.nextInt();
            m=new boolean[n+1];
            i=0;
            p=0;
            while(i++<n){
                inst=scanner.next();
                switch(inst){
                    case "LEFT":
                        m[i]=false;
                        --p;
                        break;
                    case "RIGHT":
                        m[i]=true;
                        ++p;
                        break;
                    case "SAME" :
                        scanner.next();
                        if(m[scanner.nextInt()]){
                            m[i]=true;
                            ++p;
                        }else{
                            m[i]=false;
                            --p;
                        }
                }
            }
            op.append(p+"\n");
        }
        System.out.print(op.toString());
    }
}

/*
2
3
LEFT
RIGHT
SAME AS 2
5
LEFT
SAME AS 1
SAME AS 2
SAME AS 1
SAME AS 4
 */