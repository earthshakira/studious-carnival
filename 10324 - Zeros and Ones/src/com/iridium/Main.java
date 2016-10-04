package com.iridium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception{
        // write your code here
        StringBuilder op = new StringBuilder();
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(isr);
            String input;
            int i = 0;
            boolean dec;
            char thi;
            while ((input = reader.readLine()) != null) {
                op.append("Case ").append(++i).append(":\n");
                int n = Integer.parseInt(reader.readLine());
                while (n-- > 0) {
                    String[] tmp = reader.readLine().split(" ");
                    int l = Integer.parseInt(tmp[0]);
                    int u = Integer.parseInt(tmp[1]);
                    if (l > u) {
                        l ^= u;
                        u ^= l;
                        l ^= u;
                    }
                    //System.out.println(l + "|" + u);
                    dec = true;
                    if(l<u) {
                        for (; l < u; l++) {
                            if (input.charAt(l)!=input.charAt(l+1) ) {
                                dec = false;
                                break;
                            }
                        }
                    }
                    op.append((dec ? "Yes\n" : "No\n"));
                }
            }
            System.out.print(op.toString());
            return;

    }
}

/*
0000011111
3
0  5
4  2
5  9
01010101010101010101010101111111111111111111111111111111111110000000000000000
5
4  4
25  60
1  3
62  76
24  62
1
1
0  0
 */