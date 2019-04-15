package com.example.java;

import java.util.Scanner;

public class Main {

    public static int[] solution;
    //public static int[] tab;
    public static int N=0;
    //public static int[] tab = new int[]{};
    public static void main(String[] args) {
    System.out.println("Hello , we need to help in Jeff's problem to calculate the space in the array ");
    System.out.println("Insert your test cases number :  ");
    Scanner cs = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Scanner tb = new Scanner(System.in);
    int T = cs.nextInt();

    for(int l=0 ; l<T ; l++) {
        N = cs.nextInt();
        String tab1[]=new String[N];
        int tab[]=new int[N];
        for (int i = 0; i < N; i++) {

            tab1[i] = tb.next();
            tab[i] = Integer.parseInt(tab1[i]);

        }


        //System.out.println();
        chall(tab);
    }


    }

    public static void chall(int[] tab){
            int space =1 ;
            int space0 = 0;

            for(int i=0 ; i<tab.length ; i++){
                if(i+1 == N) break;

                if(tab[i]<=tab[i+1]){
                    if(tab[i]==0){
                        space=1;
                    }
                    else space+=1;

                    }

            }
            System.out.println(space);

    }
}
