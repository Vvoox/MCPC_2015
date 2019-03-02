#include <iostream>

using namespace std;

int main()
{
    int T ;
    int Yellow_counter=0;
    cin>>T;
    int n,m;
    cin>>m;
    cin>>n;
    int a[m];
    for(int i=0;i<m;i++){
        cin>>a[i];
    }
    if (m>=n){
        for(int j=0 ; j<n ; j++){
            if(a[j]==0)
                Yellow_counter=Yellow_counter+1;
            else
                break;

        }

    }
    else if(m<n){

        for(int j=0 ; j<n ;j++)
            if(a[j]==0)
                Yellow_counter+=1;
        for(int l=n-m;l>0;--l)
            if(a[l]==0)
                 Yellow_counter+=1;
    }


    cout<<Yellow_counter<<endl;














}

