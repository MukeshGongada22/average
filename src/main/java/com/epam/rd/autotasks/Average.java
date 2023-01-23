package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int n=scanner.nextInt();
        int count=0;
        int m=0;
        while(n!=0){

            m+=n;
            count++;
            n=scanner.nextInt();
        }
        System.out.println(m/count);

    }

}