/*
選択ソート
*/
#include<iostream>
using namespace std;

void selectionSort(int a[],int n){
    int i,v,cnt = 0,min;
    for(int i=0;i<n-1;i++){
        min=i;
        for(int j=i;j<n;j++){
            if(a[j] < a[min])min=j;
        }
        swap(a[i],a[min]);
        if(i != min)cnt++;
    }
}

int main(){
    int a[100],cnt;
    int n;

    cin >> n;
    for(int i=0;i<n;i++)cin >> a[i];

    selectionSort(a,n);

    for(int i=0;i<n;i++){
        cout << a[i];
        if(i!=n-1)cout << " ";
    }
    cout << endl;
    return 0;
}