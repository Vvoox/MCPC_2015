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

  //  if(nV % 2 == 0){
      length=nH + nV ;
      int slides[length];
        for(int i ; i<N ; i++){
           // if (orientation[i]=='H' && orientation[i+1]=='H'){ // first attempt comp between H and H
            for(int j=1 ; j<N; j++){

                    for(int k=0 ; k<Tmax ;k++){

                        for(int l=0 ; l<Tmax ; l++){


                             if(  Tags[i][k]==Tags[j][l]){
                                 for(int h ; h<length ; h++){
                                     slides[h]=i;
                                     slides[h+1]=j;

                                 }


                            }
                             else
                                 break;
                        }                       

            }

            \
           /* if(Tags[0][0]==Tags[1][1]){
                cout<<"there is linking tag between image "<<endl;
            }
            else {
                cout<<"NO connection Tags"<<endl;
            }*/
        //}

       //   if (orientation[i]=='H' && orientation[i+1]=='V') // first attempt comp between H and V
     /*   cout<<length<<endl; ;
        for(int i ; i<length ; i++){
                cout<<slides[i]<<endl;

        }*/

        }

    /*else

        nslides=nH + (nV+1)/2;*/


    }
    cout<<"The collection has "<<length<<" photos"<<endl;
    for(int i=0;i<length;i++){
        cout<<slides[i]<<endl;


    }

  }











