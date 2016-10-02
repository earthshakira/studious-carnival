package com.iridium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner scanner = new Scanner(System.in);
            StringBuilder op = new StringBuilder();
            int n, p, rfpno = 1;
            String best="",now="";
            double compliance,minprice,price,req;
            while (true) {
                n = scanner.nextInt();
                p = scanner.nextInt();
                if (n == 0) {
                    op.deleteCharAt(op.length()-1);
                    System.out.print(op.toString());
                    return;
                }
                compliance=Double.MIN_VALUE;
                minprice=Double.MAX_VALUE;
                try {
                    for (int i = 0; i <=n; i++)scanner.nextLine();
                }catch(Exception e){

                }
                while(p-- >0) {
                    now = scanner.nextLine();
                    price = Double.parseDouble(scanner.next());
                    req = Double.parseDouble(scanner.next());
                    for (int i = 0; i <=req; i++)scanner.nextLine();
                    req/=n;
                    if(req>compliance){
                        best=now;
                        compliance=req;
                        minprice=price;
                    }else if(req==compliance){
                        if(price<minprice)
                            best=now;
                    }
                }
                op.append("RFP #"+rfpno+"\n"+best+"\n\n");
                rfpno++;
            }
    }
}


/*
6 4
engine
brakes
tires
ashtray
vinyl roof
trip computer
Chevrolet
20000.00 3
engine
tires
brakes
Cadillac
70000.00 4
ashtray
vinyl roof
trip computer
engine
Hyundai
10000.00 3
engine
tires
ashtray
Lada
6000.00 1
tires
1 1
coffee
Starbucks
1.50 1
coffee
0 0
 */

