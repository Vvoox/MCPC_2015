package Eating_pizaa;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello , we need to know the area of the circle for serve for enough attendees ");
        Scanner cas = new Scanner(System.in);
        int T = cas.nextInt();//number of cases you've;
        int[] areaT = new int[T];
        Scanner ar = new Scanner(System.in);
        for(int i=0 ; i<T ; i++){
            areaT[i]=ar.nextInt(); // table of all tests you need;
        }
        eating_pizza(T,areaT);

    }
    public static void eating_pizza(int T ,int[] areaT){
        double[] areaC = new double[T];
        double A=0;
        double B=0;

        for(int i=0 ; i<T ; i++){

            A = 4 / (3* Math.sqrt(3) ) * areaT[i] * Math.PI; // calculate the area of circle from triangle area ;
            areaC[i]=A; // insert output value int new table  ;
        }

        for(int i=0 ; i<T ; i++){
            System.out.println(areaC[i]);//show the output;
        }
    }
}



