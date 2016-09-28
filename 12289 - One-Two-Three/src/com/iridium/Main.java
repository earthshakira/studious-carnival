package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String y;
        Solve x=new Solve();
        int T=scanner.nextInt();
        while(T-- >0){
            y=scanner.next();
            System.out.println(x.solve(y));
        }

    }
}

class Solve{
    final String d[]={"","one","two","three"};
    int m,i,j;
    int solve(String x){
        if(x.length()==5)
            return 3;
        for(i=1;i<3;i++){
            m=0;
            for(j=0;j<d[i].length();j++)
                if(x.charAt(j)!=d[i].charAt(j))
                    m++;
            if(m<=1)
                return i;
        }
        return 0;
    }
}
