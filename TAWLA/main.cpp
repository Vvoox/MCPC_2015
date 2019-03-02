#include"stdafx.h"
#include<iostream>
using namespace std;

int main(){
    int T ;
    cin>>T;
    int t[T];
    for(int i=0;i<T;i++){
        cin>>t[i];
    }
	for (int i = 0; i < T; i++) {
		cout << t[i] / 6 << endl;
	}

         
}


