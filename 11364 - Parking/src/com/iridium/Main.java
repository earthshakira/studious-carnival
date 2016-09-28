package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t,n,min,max,x;
        t=scanner.nextInt();
        while(t-->0){
            n=scanner.nextInt();
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            while (n-->0){
                x=scanner.nextInt();
                max=(x>max)?max:x;
                min=(x<min)?min:x;
            }
            System.out.println(2*(max-min));
        }

    }

}
