//still work on it , final solution soon .
#include <iostream>
#include <string>
//#include<fstream>


using namespace std;
int main(){
  //  ifstream myfile;
   // myfile.open ("a_example.txt");
    int N;
    int Tmax ;
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
            cin>>Tags[i][j];//fill in all tags in tag's tableau;

        }
        }
 /*   for(int l ; l<N ; l++){
        for(int k ; k<Tmax ; k++){
        cout<<Tags[l][k];
        }
    cout<<endl;}*/
     int length ;
  //  if(nV % 2 == 0){
     length= nH + nV ;
     int slides[length][2];
    // slides[0]=0;
   /*  for(int q ; q<length ; q++){
         cout<<slides[q]<<endl;}
      //for(int i ; i<length ; i++){  slides[i]=0;}//Initialize all elements of table to 0;
      for(int i=0;i<length;i++){
          //slides[i]=0;
          cout<<slides[i]<<endl;}*/
   slides[0][0]=0;
   int cnt=0;
     for(int i=0 ; i<N ; i++){

         if( length == 1 ){
         slides[0][0]=0;
         cout<<slides[0][0]<<endl;
         break;}
            // if (orientation[i]=='H' && orientation[i+1]=='H'){ // first attempt comp between H and H
            for(int l=0 ; l<Tmax; l++){
                if(Tags[i][l].size()!=0 || Tags[i][l].size()!=0  ){

                    for(int j=1 ; j<N ;j++){
                      //  if(j==0) break;
                       // else {
                           for(int k=0 ; k<Tmax ; k++){
                         //  for(int h=1 ; h<length ; h++){ // boucle for fill in slides tableau ;
                               //for(int w ; w<34 ; w++){
                                  // if(Tags[i][k]!= word[w]) break;
                                   //else{
                                       if( Tags[i][l]==Tags[j][k] ){

                                             if( i!=j  ){

                                                     slides[cnt][0]=i;
                                                     slides[cnt][1]=j;
                                                     cnt++;


                                                     //cout<<slides[i][0]<<"\t"<<slides[i][1]<<endl;
                                                    // cout<< Tags[i][l].size()<<endl;
                                             }

                                             else break;
                                    // }
                                      //else break;

                                         //cout<<"test" << i<<" "<< j <<endl;
                                     }

                                         //cout<<"there is no linking Tags between slides"<<endl;
                                     // }
                                 }
                       // }
                    }
                }
                else break;
            }
            }
    cout<<endl;
   cout<<"The slideshow has "<<length<<" slides"<<endl;
   //cout<<word[10]<<endl;
  for(int l=0 ; l<length ; l++){
         // cout<<slides[l];
              cout<<slides[l][0]<<"\t"<<slides[l][1];
             // cout<<word[l];
              cout<<endl;


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








