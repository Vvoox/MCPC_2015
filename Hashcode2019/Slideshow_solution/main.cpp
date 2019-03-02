#include <iostream>
#include <string.h>

using namespace std;
int main(){
    int N;
    int Tmax=0 ;
    cin>>N ;
    int M[N];
    char orientation[N];
    string Tags[N][99];
    int nH=0;
    int nV=0;

    for(int i=0;i<N;i++){
        cin>>orientation[i]>>M[i];
        int Mi=M[i];
        char ori=orientation[i];
        if (ori=='H') nH++;
        else if(ori=='V') nV++;
        //string t[Mi];
        if (Tmax<Mi){
            Tmax=Mi;}

        for(int j=0;j<Mi;j++){
            cin>>Tags[i][j];

        }
        }
    int length ;

    if(nV % 2 == 0){
        length=nH + nV ;
        int slides[length][2];
        for(int i ; i<N ; i++){
           // if (orientation[i]=='H' && orientation[i+1]=='H'){ // first attempt comp between H and H
            for(int j=i+1 ; j<N; j++){
                if(i+1==N) break;
                else {

                    for(int k ; k<Tmax ;k++){

                        //if(i+1==N) break;

                         if(Tags[i][k]==Tags[j][k]){

                             slides[i][0]=i;
                             slides[i+1][0]=i+1;

                            }
                         
                            else
                                break;
                    }

                }
            }
        }

       //   if (orientation[i]=='H' && orientation[i+1]=='V') // first attempt comp between H and V
        cout<<length ;
        for(int i ; i<length ; i++){

            //for (int j ; j<1 ; j++){

                cout<<slides[i][0]<<endl;
            //}
           // cout<<"\n";






        }








        }
    /*else

        nslides=nH + (nV+1)/2;*/


    }







   /* cout<<"The collection has "<<N<<" photos"<<endl;
    for(int k=0;k<N;k++){
        cout<<"Photo "<<k<<" is "<< orientation[k] <<" and has tags "<<"[ ";
        for(int l=0;l<Tmax ; l++){

            cout<<Tags[k][l]<<","<<"\t" ;

    }
    cout<<"]";
    cout<<"\n";




    }*/









