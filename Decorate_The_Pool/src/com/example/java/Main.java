package com.example.java;

import java.util.Scanner;
//import java.lang.Math;
import java.lang.*;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, we need to help Youssef to align all edges of pool ");
        System.out.print("Insert the number of cases : ");
        Scanner cs = new Scanner(System.in);
        Scanner vol = new Scanner(System.in);
        int T = cs.nextInt() ;
        double[] volume =new double[T];//number of cases
        for(int i=0 ; i<T ; i++){
            volume[i] = vol.nextDouble();//insert all value of volumes examples you want;
        }
        pool(T,volume);

    }

    public static void pool(int T , double[] V){
        int[] meters = new int[T];
        double n=0;
        int m=0;

        for(int i=0 ; i<T ; i++){;//for all cases

            n=Math.cbrt(V[i]);//cube root for all volumes
            m=(int)n;//convert double into integer , because we need a clear value
            meters[i]= m*12;//multiplication of all edges we've;

        }
        //System.out.println(m);
        for (int i=0 ; i<T ; i++){
            System.out.println(meters[i]);//show result;
        }
    }
}

