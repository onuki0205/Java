/*
選択ソート
*/
#include<stdio.h>

void selectionSort(int a[],int n){
    int i,v,cnt = 0,min;
    for(int i=0;i<n-1;i++){
        min=i;
        for(int j=i;j<n;j++){
            if(a[j] < a[min])min=j;
        }
        v = a[i];
        a[i] = a[min];
        a[min]= v;
        if(i != min)cnt++;
    }
}

int main(){
    int a[100],cnt;
    int n;

    scanf("%d",&n);
    for(int i=0;i<n;i++)scanf("%d",&a[i]);

    selectionSort(a,n);

    for(int i=0;i<n;i++){
        printf("%d",a[i]);
        if(i!=n-1)printf(" ");
    }
    printf("\n");
    return 0;
}