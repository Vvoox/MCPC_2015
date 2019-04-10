package funatchezali;

import java.util.Scanner;

public class Fun_at_Chez_Ali {

    public static int T=0 ,N=0 ,M=0;

    public static void main(String[] args){
        System.out.println("let's help the team to calculate the shortest path ");
        Scanner cs = new Scanner(System.in);
        T = cs.nextInt();
        Scanner members = new Scanner(System.in);
        Scanner queries = new Scanner(System.in);
        String n=" ";
        String m=" ";
        for(int i=0 ; i<T ; i++){

            N = members.nextInt();
            M = queries.nextInt();
        }
        //int N =Integer.parseInt(n);
       // int M=Integer.parseInt(m);
        show(N,M);

    }
    public static void show(int N , int M){

        int matrix[][] = new int[N-1][3];
        int queries[][] = new int[M][2];
        String matrix1[][] = new String[N-1][3];
        String queries1[][] = new String[M][2];
        //Scanner line = new Scanner(System.in);
        //Scanner column = new Scanner (System.in);
        Scanner content = new Scanner(System.in);


        for(int i=0 ; i<N-1 ; i++){
            for(int j=0 ; j<3 ; j++){

                matrix1[i][j]=content.next();
                matrix[i][j]=Integer.parseInt(matrix1[i][j]);
            }
        }
        for(int i=0 ; i<M ; i++){
            for(int j=0 ; j<2 ; j++){

                queries1[i][j]=content.next();
                queries[i][j]=Integer.parseInt(queries1[i][j]);
            }
        }

        for(int i=0 ; i<N-1 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0 ; i<M ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(queries[i][j]+" ");
            }
            System.out.println();
        }
        head(matrix,queries);
    }
    public static void head(int[] matrix[] , int[] queries[]){
        //int cost=0;
        int[] cst = new int[M];

        for(int k=0 ; k<M ; k++) {
            int cost=0;
            for (int i = 0; i < N - 1; i++) { {

                    if (queries[k][0]==matrix[i][0] || queries[k][0]==matrix[i][1]){

                        //for(int j=0 ; j<)
                        if(queries[k][1]==matrix[i][1] || queries[k][1]==matrix[i][0]){
                            cost+=matrix[i][2];
                            break;
                        }

                        if(matrix[i][1]==matrix[i][0]){

                        }


                        }

                    }
                }
            cst[k]=cost;

            }

        for(int k=0 ; k<M ; k++){
            System.out.println(cst[k]);}
        adj_matrix(matrix);
        }



        public static void adj_matrix(int[] matrix[]) {

        int[] adj_mat[] = new int[N-1][N-1];
            for (int i = 1; i < N; i++) {

                for (int j = 1; j < N; j++) {

                    if (i == j) {
                        adj_mat[i][j]=1;

                    }
                    adj_mat[i][0]//my idea here is to create an adj matrix , i think is the way to create a shortest way to reach everyone.
                }


            }

        }


    }

