package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println("Hello , we need to help in Jeff's problem to calculate the space in the array ");
    System.out.print("Insert your test cases number :  ");
    Scanner cs = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Scanner tb = new Scanner(System.in);
    int T = cs.nextInt();
    for(int l=0 ; l<T ; l++) {
        int N = cs.nextInt();
        String tab1[]=new String[N];
        int tab[]=new int[N];
        for (int i = 0; i < N; i++) {

            tab1[i] = tb.next();
            tab[i] = Integer.parseInt(tab1[i]);

        }
    }
    for(int i=0 ; i<N ; i++){

        System.out.print(tab1[i]+" ");
    }
    chall(tab);

    }

    public static void chall(int tab[]){
            int space =0 ;

            for(int i=0 ; i<tab.length ; i++){

                for(int j=i+1 ; j<tab.length ; j++){

                    if(tab[i]<=tab[j]){
                         space+=1;


                    }
                }
            }
            System.out.println(space);

    }
}
