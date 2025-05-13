/*
挿入ソート
*/

#include<stdio.h>

void prot(int a[], int n){
    for(int i=0;i<n;i++){
        printf("%d",a[i]);
        if(i!=n-1)printf(" ");
    }
    printf("\n");
}

void insertSort(int a[],int n){
    int v,j;
    for(int i=0;i<n;i++){
        v=a[i];
        j=i-1;
        while(j >= 0 && a[j] > v){
            a[j+1]=a[j];
            j--;
        }
        a[j+1] = v;
        prot(a,n);
    }
}

int main(){
    int n;
    int a[100];

    scanf("%d",&n);
    for(int i=0;i<n;i++)scanf("%d",&a[i]);

    prot(a,n);
    insertSort(a,n);

    return 0;
}