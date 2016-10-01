package com.iridium;

/*
18101721	12554	A Special "Happy Birthday" Song!!!	Accepted	JAVA	0.050	2016-10-01 20:17:04
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder op=new StringBuilder();
        String song[]={
                ": Happy\n",": birthday\n",": to\n",": you\n",
                ": Happy\n",": birthday\n",": to\n",": you\n",
                ": Happy\n",": birthday\n",": to\n",": Rujia\n",
                ": Happy\n",": birthday\n",": to\n",": you\n"};
        int n=scanner.nextInt(),i=0;
        String person[]=new String[n+1];
        while(i<n){
            person[i++]=scanner.next();
        }
        i=0;
        while(i<n || i%16!=0){
            op.append(person[i%n]+song[i%16]);
            i++;
        }
        System.out.print(op);
    }
}
