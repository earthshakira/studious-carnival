package com.iridium;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String,Integer> names=new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        StringBuilder op=new StringBuilder();
        String nameOrder[];
        String giver;
        int n,t,money;
        while (scanner.hasNext()){
            names=new HashMap<>();
            n=scanner.nextInt();
            nameOrder=new String[n];
            for(int i=0;i<n;i++) {
                nameOrder[i]=scanner.next();
                names.put(nameOrder[i] ,0);
            }

            for(int i=0;i<n;i++){
                giver=scanner.next();
                money=scanner.nextInt();
                t=scanner.nextInt();
                if(t>0) {
                    money = (money / t) * t;
                    names.put(giver, names.get(giver) - money);
                    money = money / t;
                    while (t-- > 0) {
                        giver = scanner.next();
                        names.put(giver, names.get(giver) + money);
                    }
                }
            }

            for(int i=0;i<nameOrder.length;i++){
                op.append(nameOrder[i]+" "+names.get(nameOrder[i])+"\n");
            }
            if(scanner.hasNext())op.append("\n");
            else System.out.print(op.toString());
        }
    }
}
