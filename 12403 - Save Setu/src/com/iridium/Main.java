package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        int m=0;

        while(T-->0){
            if((scanner.next()).equals("donate"))
                m+=scanner.nextInt();
            else System.out.println(m);
        }
    }
}
