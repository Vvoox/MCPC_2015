package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello , we need to help for disallowed the hackers to send paquest to the computer ; Hack Me Not ");
        System.out.println("Insert the number of cases : ");
        Scanner cs = new Scanner(System.in);
        Scanner space = new Scanner(System.in);
        int T = cs.nextInt();
        for(int i=0 ; i<T ; i++){

            int N = space.nextInt();
            String[][] matrix1 = new String[N][N];
            int[][] matrix = new int[N][N];
            Scanner val = new Scanner(System.in);

            for(int j=0 ; j<N ; j++) {
                for(int l=0 ; l<N ; l++){

                    matrix1[j][l]=val.next();
                    matrix[j][l]=Integer.parseInt(matrix1[j][l]);

                }
            }
            /*for(int k=0; k<N ; k++){

                for(int l =0 ; l<N ; l++){

                    System.out.print(matrix[k][l]+" ");
                }
                System.out.println();
            }*/
            hackme(matrix,N);


        }

    }

    public static void hackme(int[][] tab , int N){
        int[][] cost = new int[N][N];


        for(int i=0;i<N ; i++ ){

            for(int j=0 ; j<N ; j++){

                if(i==j){
                    cost[i][j]=0;}
                else {

                    int line =0 , column=0 ;
                    for(int l=0 ; l<N ; l++) {

                          line +=tab[i][l];
                          column += tab[l][j];


                    }

                    if(line<column) cost[i][j]=line;
                    else cost[i][j]=column;


                }

            }
        }
        for(int i=0 ; i<N ; i++){

            for(int j=0 ; j<N; j++){

                System.out.print(cost[i][j]+" ");
            }
            System.out.println();
        }





    }
}
