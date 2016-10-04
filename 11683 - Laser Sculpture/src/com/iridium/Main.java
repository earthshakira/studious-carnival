package com.iridium;

import java.util.Scanner;

/*
18118183 	11683 	Laser Sculpture 	Accepted 	JAVA 	0.410 	2016-10-04 17:06:38
18118080 	11683 	Laser Sculpture 	Wrong answer 	JAVA 	0.060 	2016-10-04 16:49:06
18118017 	11683 	Laser Sculpture 	Wrong answer 	JAVA 	0.350 	2016-10-04 16:34:38
18117902 	11683 	Laser Sculpture 	Time limit exceeded 	JAVA 	1.000 	2016-10-04 16:17:25
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scr = new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        int a,c;
        while((a = scr.nextInt()) != 0){
            c= scr.nextInt();
            int cols[]=new int[c+1];
            cols[c]=a;
            int count = 0;
            int max=0;
            boolean slope=false;
            cols[0] = scr.nextInt();
            for(int i=1;i<(c);i++) {
                cols[i] = scr.nextInt();
                if(cols[i]>cols[i-1]){
                    count+=cols[i]-cols[i-1];
                }
            }
            if(cols[c]>cols[c-1]){
                count+=cols[c]-cols[c-1];
            }
            op.append(count).append("\n");
        }
        System.out.print(op.toString());
    }
}
/*
5  8
1  2  3  2  0  3  4  5
3  3
1  0  2
4  3
4  4  1
0

9 9
5 4 5 9 0 6 8 8 2
1 6
0 0 0 0 1 0
9 3
0 5 5
3 10
1 2 1 2 2 2 3 2 2 0
3 8
2 3 0 0 3 1 3 3
2 6
2 0 1 1 1 0
4 2
3 2
4 1
0
2 9
2 1 0 1 0 2 1 2 1
5 8
5 0 5 3 5 5 3 1
4 6
3 1 1 4 1 3
7 8
1 2 2 3 1 0 5 7
1 9
0 1 0 1 1 1 0 1 0
1 6
1 0 1 1 1 1
8 1
6
5 9
2 2 0 3 0 5 1 1 5
3 10
1 2 0 2 1 1 2 2 1 3
5 4
2 4 5 3
2 10
2 0 2 2 1 0 2 0 2 0
8 3
7 7 1
0 0

 */