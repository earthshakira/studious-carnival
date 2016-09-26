package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int t,a[]=new int[3],n,i=1,mid;
        t=scanner.nextInt();
        while(i<=t){
            for(int j=0;j<3;j++){
                a[j]=scanner.nextInt();
            }
            if(a[0]>a[1]){
                mid=a[0];
                n=0;
            }else{
                mid=a[1];
                n=1;
            }
            if(mid>a[2]){
                mid=Math.max(a[1-n],a[2]);
            }
            System.out.println("Case "+i+": "+mid);
            i++;
        }
    }
}
