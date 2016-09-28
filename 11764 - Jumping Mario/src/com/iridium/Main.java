package com.iridium;

/*
    18080858 	11764 	Jumping Mario 	Accepted 	JAVA 	0.080 	2016-09-28 15:46:08
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int t,n,prev,current,i=0,high,low;
            t = scanner.nextInt();
            while(i<t){
                i++;
                high=0;
                low=0;
                n = scanner.nextInt();
                if(n==1){
                    scanner.nextInt();
                    System.out.println("Case "+i+": "+high+" "+low);
                    continue;
                }
                prev=scanner.nextInt();
                for(int j=1;j<n;j++){
                    current=scanner.nextInt();
                    if(prev<current)high++;
                    else if(prev>current)low++;
                    prev = current;
                }
                System.out.println("Case "+i+": "+high+" "+low);

            }
    }
}

/*
3
8
1  4  2  2  3  5  3  4
1
9
5
1  2  3  4  5
 */