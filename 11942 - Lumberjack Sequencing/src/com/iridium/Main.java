package com.iridium;


/*
18081393	11942	Lumberjack Sequencing	Accepted	JAVA	0.060	2016-09-28 17:18:58
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        sb.append("Lumberjacks:\n");
        int t=scanner.nextInt();
        int l[]=new int[10];

        boolean ordered=true,rordered=true;

        while(t-->0){
            ordered=true;
            rordered=true;
            l[0] = scanner.nextInt();
            for(int i=1;i<10;i++) {
                l[i] = scanner.nextInt();
                    if(l[i-1]>l[i])ordered=false;
                    if(l[i-1]<l[i])rordered=false;
            }
            sb.append((ordered||rordered)?"Ordered\n":"Unordered\n");

        }
        System.out.print(sb.toString());
    }
}
/*
 3
13 25 39 40 55 62 68 77 88 95
88 62 77 20 40 10 99 56 45 36
91 78 61 59 54 49 43 33 26 18
 */