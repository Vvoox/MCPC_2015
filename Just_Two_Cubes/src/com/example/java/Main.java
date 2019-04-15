package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello , we need to help Salma and Meriam to take a good picture of 2 cubes");
        System.out.println("insert your input  : ");
        Scanner cs = new Scanner(System.in);
        Scanner cb1 = new Scanner(System.in);
        Scanner cb2 = new Scanner(System.in);
        int T = cs.nextInt();
        String[][] cubes1 = new String[T][2];
        int[] cubes[] = new int[T][2];
        for(int i=0 ; i<T ; i++){
            for(int j=0 ; j<2 ; j++){

                cubes1[i][j]=cb1.next();
                cubes[i][j]=Integer.parseInt(cubes1[i][j]);

            }

        }
        cube(cubes,T);

    }
    public static void cube(int[][] tab ,int T){
        String output[]=new String[T];

        for(int i=0 ; i<T ; i++){

            if(tab[i][0]<tab[i][1]){
                output[i] = "YES";

            }
            else
                output[i]="NO";

        }
        for(int i=0;i<T;i++){

            System.out.println(output[i]);
        }


    }
}
