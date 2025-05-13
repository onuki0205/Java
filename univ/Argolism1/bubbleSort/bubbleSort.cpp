/*
バブルソート
*/
#include<iostream>
using namespace std;

void bubbleSort(int a[], int n){
    int cnt;
    bool flag = 1;

    for(int i=0;i<n;i++){
        flag=0;
        for(int j=n-1;j>=i+1;j--){
            if(a[j]<a[j-1]){
                swap(a[j],a[j-1]);
                flag=1;
                cnt++;
            }
        }  
    }
}

int main(){
    int a[100],n,cnt;
    cin >> n;

    for(int i=0;i<n;i++)cin>>a[i];

    bubbleSort(a,n);

    for(int i=0;i<n;i++){
        cout<<a[i];
        if(i!=n-1)cout<<" ";
    }

    cout<<endl;
    return 0;
}