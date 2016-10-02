package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =  new Scanner(System.in);
        StringBuilder op = new StringBuilder();
        int n,m,c,current,draw[],max,dev,seqno=1;
        boolean state[],blown;
        while(true) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            c = scanner.nextInt();
            if(n==0) {
                System.out.print(op.toString());
                return;
            }
            current=0;
            max=Integer.MIN_VALUE;
            state=new boolean[n+1];
            draw =new int[n+1];
            blown=false;
            for(int i=1;i<=n;i++)
                draw[i]=scanner.nextInt();
            while(m-->0){
                dev=scanner.nextInt();
                state[dev]=!state[dev];
                if(state[dev]){
                    current+=draw[dev];
                    if(current>c)
                        blown=true;
                    else max=Integer.max(max,current);
                }else{
                    current-=draw[dev];
                }
            }
            if(blown){
                op.append("Sequence "+seqno+"\nFuse was blown.\n\n");
            }else{
                op.append("Sequence "+seqno+"\nFuse was not blown.\n" +
                        "Maximal power consumption was "+max+" amperes.\n\n");
            }
            seqno++;
        }
    }
}
/*
2 2 10
5
7
1
2
3 6 10
2
5
7
2
1
2
3
1
3
0 0 0
 */