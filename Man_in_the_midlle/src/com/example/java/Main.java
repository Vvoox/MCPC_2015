package com.example.java;

import java.util.Scanner;

public class Main {
    public static int T=0;

    public static void main(String[] args) {
        System.out.println("Hello, we are helping to decode the hash that Alice send it to Bob , for not spying it");
        System.out.print("Please insert your T number of cases : ");
        Scanner cs = new Scanner(System.in);
        Scanner lg = new Scanner(System.in);
        Scanner hash = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        //int L=0 , H=0 , M=0;
        T =cs.nextInt();
        int[] task[] = new int[T][3];
        for(int i=0 ; i<T ; i++){

            task[i][0] =lg.nextInt();
            task[i][1]= hash.nextInt();
            task[i][2]= m.nextInt();

        }
        for(int i=0 ; i<T ; i++){

            for(int j=0 ; j<3 ; j++){

                System.out.print(task[i][j]+" ");

            }
            System.out.println();
        }
        mitm(task);

    }
    public static void mitm(int[] tab[]){
        //String stg[]= new String[1];
        char tt[] = new char[2];

            for(int i=0 ; i<T ; i++) {


            }


    }
}
