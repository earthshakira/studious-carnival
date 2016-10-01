package com.iridium;

/*
18101498	12157	Tariff Plan	Accepted	JAVA	0.080	2016-10-01 19:26:00
18101491	12157	Tariff Plan	Runtime error	JAVA	0.000	2016-10-01 19:22:14
failed as I used int for truncating decimal
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder op=new StringBuilder();
        int t,n,duration,i=0;
        float mile,juice;
        t=scanner.nextInt();
        while(i++ < t){
            n=scanner.nextInt();
            mile=0;
            juice=0;
            while(n-->0){
                duration=scanner.nextInt();
                mile+=Math.ceil((duration+1)/30.0000);
                juice+=Math.ceil((duration+1)/60.0000);
            }
            mile*=10;
            juice*=15;

            if(mile==juice)op.append("Case "+i+": Mile Juice "+ String.format("%d",(long)mile));
            else if(mile<juice)op.append("Case "+i+": Mile "+ String.format("%d",(long)mile));
            else op.append("Case "+i+": Juice "+ String.format("%d",(long)juice));
            op.append("\n");
        }
        System.out.print(op.toString());
    }
}
