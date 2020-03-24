package com.tgt.ignite.plus;

import java.util.Scanner;

public class display {
    public static void main(String[] args){
        int n,i,rev = 0,num,count=0;
        Scanner read = new Scanner(System.in);
        System.out.println("enter a number");
        n = read.nextInt();
        while(n>0){
            rev = rev*10 + n%10;
            n=n/10;
            ++count;
        }
        for(i=0;i<count;i++){
            num=rev%10;
            rev=rev/10;
            String[] one= new String[]{" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            System.out.print( one[num]+" ");
        }


    }
}
