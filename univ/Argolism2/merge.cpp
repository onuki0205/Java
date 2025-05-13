#include<iostream>
using namespace std;
#define MAX 100

int b[MAX];

void merge(int a[],int left,int mid,int right){
    int i,j,k;

    for (i = left; i <= mid; i++)
        b[i] = a[i];

    for (i = mid + 1, j = right; i <= right; i++, j--)
        b[i] = a[j];

    i = left;         
    j = right;        

    for (k = left; k <= right; k++){
        if (b[i] <= b[j])        
            a[k] = b[i++];
        else
            a[k] = b[j--];
    }
}

void mergeSort(int a[], int left, int right){
    if(left < right){
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);
        merge(a,left,mid,right);
    }
}


int main() {
    int i;
    int a[]= {6,5,9,3,1,8,7,0,2,4};
    int m = sizeof(a) / sizeof(int);

    cout << "Before" << endl;
    for(i = 0; i < m; i++){
        cout << a[i] << " ";
    }
    cout << endl;

    mergeSort(a,0,m-1);

    cout << "After" << endl;
    for(i = 0; i < m; i++){
        cout << a[i] << " ";
    }
    cout << endl;

    return 0;
}