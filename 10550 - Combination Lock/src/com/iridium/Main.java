package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        int init,turns,t1,t2,t3;
        while(scanner.hasNextLine()){
            turns=120;
            init=scanner.nextInt();
            t1=scanner.nextInt();
            t2=scanner.nextInt();
            t3=scanner.nextInt();
            if(init==0 && t2==0 && t1==0 && t3==0)
                break;
            turns+=(init-t1+40)%40;
            turns+=(t2-t1+40)%40;
            turns+=(t2-t3+40)%40;
            turns*=9;
            op.append(turns+"\n");
        }
        System.out.println(op.toString());
    }
}
