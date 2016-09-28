package com.iridium;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            int months=scanner.nextInt();
            double downPayment=scanner.nextDouble(),amount=scanner.nextDouble()+downPayment,carValue=amount,installments;
            int t=scanner.nextInt();
            if(months<0)
                return;
            double d[][]=new double[t][2];
            for(int i=0;i<t;i++){
                d[i][0]=scanner.nextDouble();
                d[i][1]=scanner.nextDouble();
            }
            int current=0;
            amount-=downPayment;
            installments=amount/months;
            carValue=carValue*(1-d[current][1]);
            for(int i=1;i<months;i++){
                if(current<d.length-1 && i>=d[current+1][0]){
                    current++;
                }
                amount-=installments;
                carValue=carValue*(1-d[current][1]);
                //System.out.println(carValue+"|"+amount+"|"+d[current][1]);
                if(carValue>amount){
                    System.out.print(i+" month");
                    if(i==1)
                        System.out.println("");
                    else System.out.println("s");

                    break;
                }
            }

        }
    }
}

/*
30 500.0 15000.0 3
0 .10
1 .03
3 .002
12 500.0 9999.99 2
0 .05
2 .1
60 2400.0 30000.0 3
0 .2
1 .05
12 .025
-99 0 17000 1
 */