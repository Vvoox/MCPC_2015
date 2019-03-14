#include <iostream>
#include <string>
//#include<fstream>


using namespace std;

void Permut(string *tags1,string *tags2, int n){
    string temp;
    //int Num;
    for (int i = 0 ; i<n ; i++){

            temp = tags1[i];
            tags1[i]=tags2[i];
            tags2[i]=temp;
            //Num = line_one;
           // line_one = line_two;
           // line_two = Num;
    }

}
int main(){
   //ifstream myfile;
   // myfile.open ("a_example.txt");
    int N;
    int Tmax ;
    cin>>N ;
    int M[N];
    char orientation[N];
    string Tags[N][99];
    int nH=0;
    int nV=0;
    int cnt=1;
    string Tagsplus[1][99];



    for(int i=0;i<N;i++){
        cin>>orientation[i];
        cin>>M[i];
        int Mi=M[i];
        char ori=orientation[i];
        if (ori=='H') nH++;
        else if(ori=='V') nV++;
        //string t[Mi];
        if (Tmax<Mi){
            Tmax=Mi;}

        for(int l=0 ; l<Mi ; l++){
            cin>>Tags[i][l];
        }
        }//fill in all tags in tag's tableau;
 /*               if(Tags[i][l].size()!=0  ){
                    for(int j=0 ; j<N ;j++){
                        for(int k=0 ; k<Tmax ; k++){
                            if( Tags[i][l]==Tags[j][k] && Tags[j][k].size()!=0 ){
                                if( i!=j  ){
                                    for(int n=0 ; n<Tmax ; n++){
                                       // if(i==N) break;
                                        //else
                                           Tags[i+1][n]=Tagsplus[0][n];
                                           Tagsplus[0][n]=Tags[j][n];
                                          // Tags[j][n]=Tagsplus[j][n];
                                    }

                                    //slides[cnt]=j;
                                  //  cnt++;

                                }
                                else break;
                            }
                            else break;
                        }
                    }
                }
                else break;



        }
        }
        */

   int length ;
  //  if(nV % 2 == 0){
   length= nH + nV ;
   int slides[99];
   slides[0]=0;
//   int slides[length][2];
//   slides[0][0]=0;
//   int cnt=0;
   int nmb;
  for(int i=0 ; i<N ; i++){

       if( N == 1 ) break;

       else {
            for(int l=0 ; l<Tmax; l++){
                //string tagTemp = Tags[i][l];
                if(Tags[i][l].size() != 0) {
                    for(int j =1; j < N ; j++) {
                        if(i==j) break;

                       else {

                            for(int k = 0; k < Tmax; k++) {
                                if (Tags[i][l] == Tags[j][k] ) {

                                    if(j-i==1){
                                        cout<<" there is one line between i and j"<<endl;
                                        slides[cnt]=j;
                                        cnt++;
                                        break;
                                    }
                                    else {
                                        cout<<"there is more than one line between i and j"<<endl;
                                        Permut( Tags[i+1],Tags[j], N);
                                        //cout<<j<<"\n";
                                        nmb=i+1;
                                        slides[cnt]=j;

                                        slides[j]=nmb;

                                        cnt++;
                                    }
                        }
                        else {
                                    slides[cnt]=j;
                                    cnt++;
                                    break;
                    }
                        }

                        }
               }

         }
                else {
                    slides[cnt]=i;
                    cnt++;
                    break;}
    }
 }
      // cout<<i<<"\t";
  }
  // int length =nH + nV ;
   cout<<endl;
   cout<<N-1<<endl;
  for(int i=0 ; i<N ; i++){
       cout<<slides[i]<<"\t";
      for(int j=0 ;j<Tmax ; j++ ){
          //if( length == 1 ){
                  //cout<<slides[0][0]<<endl;
                  //  cout<<slides[0]<<endl;
                 // break; }
              //  else {
           cout<<Tags[i][j]<<"\t";

      }


      cout<<endl;
//      cout<<i<<"\n";


    //  else {

           //cout<<slides[l][0]<<"\t"<<slides[l][1]<<endl;
       //    cout<<slides[l]<<endl;
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







