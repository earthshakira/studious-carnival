package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        int i,f,up,down;
        while(true){
            i=scanner.nextInt();
            f=scanner.nextInt();
            if(i==-1){
                System.out.print(op.toString());
                return;
            }
            up=(f-i+100)%100;
            down=(i-f+100)%100;
            op.append(Integer.min(up,down)+"\n");
        }

    }
}
