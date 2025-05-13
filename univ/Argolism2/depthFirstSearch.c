#include<stdio.h>

#define N 6;

int v[N];

void visit(int matrix[],int i){
    v[i] = 1;
    int k;

    for(k=0; k<N; k++){
        if(matrix[i][k] == 1 && v[k] == 0){
            cout << i << " ==> " << k << endl;
            visit(k);
        }
    }
}

int main(){
    int matrix[N][N]={{0,1,0,1,0,0},
                          {0,0,0,0,1,0},
                          {0,0,0,0,1,1},
                          {0,1,0,0,0,0},
                          {0,0,0,1,0,0},
                          {0,0,0,0,0,1}};
    
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(j != 0)printf(" ");
            printf("%d",matrix[i][j]);
        }
        printf("\n");
    }


    for(int k=0;k<N;k++){
        visit(k);
    }

    return 0;
}