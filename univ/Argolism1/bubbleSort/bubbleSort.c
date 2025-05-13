/*
バブルソート
*/
#include<stdio.h>

void bubbleSort(int a[], int n){
    int cnt,v;
    int flag = 1;

    for(int i=0;i<n;i++){
        flag=0;
        for(int j=n-1;j>=i+1;j--){
            if(a[j]<a[j-1]){
                v = a[j];
                a[j] = a[j-1];
                a[j-1] = v;
                flag=1;
                cnt++;
            }
        }  
    }
}

int main(){
    int a[100],n,cnt;
    scanf("%d",&n);

    for(int i=0;i<n;i++)scanf("%d",&a[i]);

    bubbleSort(a,n);

    for(int i=0;i<n;i++){
        printf("%d",a[i]);
        if(i!=n-1)printf(" ");
    }

    printf("\n");
    return 0;
}