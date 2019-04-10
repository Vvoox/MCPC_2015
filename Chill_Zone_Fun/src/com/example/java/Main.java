package com.example.java;

import java.util.Scanner;

public class Main {

    //public static int T;
    //public static int[] stdcost ;
    public static int counter=0;


    //public static String symbol[][] =new String[r][c];
    public static void main(String[] args) {

        System.out.println("Hello in the Chil Zone Fun problem");
        //System.out.print("Enter your T number of cases : ");
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        //System.out.print("Enter your r the number of lines :  ");
        for (int i = 0; i < T; i++) {
            Scanner line = new Scanner(System.in);
            int r = line.nextInt();
            //System.out.print("Enter your c the number of grids : ");
            Scanner grid = new Scanner(System.in);
            int c = grid.nextInt();
            chill_zone_fun(T, r, c);
            counter++;
        }
       /* for(int j=0;j<stdcost.length;j++){
            System.out.println(stdcost[j]);
        }*/
    }

    public static void chill_zone_fun(int T, int r, int c) {
        String symbol[][] = new String[r][c];
        System.out.println("Symbols suggest is {'.','*','K','S','T'} : ");
        Scanner tab = new Scanner(System.in);

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                symbol[i][j] = tab.next();
            }
        }
       // System.out.println("Your symbol table is : ");

        /*for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print(symbol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/
    stplace(T,r, c, symbol);

}
    public static void stplace(int T ,int r , int c,String[] symbol[]){

        int x_s=0 , y_s=0 , x_t=0, y_t=0 ;

        for(int i=0 ; i<r ; i++){

            for(int j=0 ; j<c ; j++){

                if(symbol[i][j].equals("S")){
                    x_s=i;
                    y_s=j;
                }
                if(symbol[i][j].equals("T")){
                    x_t=i;
                    y_t=j;
                }
            }
        }
       // System.out.println(x_s+" "+y_s+"\n"+x_t+" "+y_t);
        cost(T , x_s , y_s , x_t ,y_t,symbol);
    }
    public static void cost(int T, int x0 , int y0 , int x1 , int y1,String[] symbol[]){
       int cost= 0;
       int[] stdcost =new int[T];
        
           if (x0 <= x1 && y0 <= y1) {
               for (int i = x0; i <= x1; i++) {
                   for (int j = y0; j <= y1; j++) {

                       if (symbol[i][j].equals(".")) {
                           cost += 1;
                       }
                       if (symbol[i][j].equals("K")) {
                           cost += 0;
                       }
                   }
               }

           }
           if (x0 >= x1 && y0 >= y1) {
               for (int i = x1; i <= x0; i++) {
                   for (int j = y1; j <= y0; j++) {

                       if (symbol[i][j].equals(".")) {
                           cost+= 1;
                       }
                       if (symbol[i][j].equals("K")) {
                           cost+= 0;
                       }
                   }
               }

           }
           if (x0 <= x1 && y0 >= y1) {
               for (int i = x0; i <= x1; i++) {
                   for (int j = y1; j <= y0; j++) {

                       if (symbol[i][j].equals(".")) {
                           cost+= 1;
                       }
                       if (symbol[i][j].equals("K")) {
                           cost+= 0;
                       }
                   }
               }

           }
           if (x0 >= x1 && y0 <= y1) {
               for (int i = x1; i <= x0; i++) {
                   for (int j = y0; j <= y1; j++) {

                       if (symbol[i][j].equals(".")) {
                           cost+= 1;
                       }
                       if (symbol[i][j].equals("K")) {
                           cost+= 0;
                       }
                   }
               }

           }
           else {
               cost+= -1 ;

           }

           System.out.println(stdcost[counter]=cost);

    }
}
