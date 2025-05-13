#include <stdio.h>

#define N 6 /* 点の数 */

int a[N+1][N+1] = {
  {0, 1, 0, 1, 0, 0},
  {0, 0, 0, 0, 1, 0},
  {0, 0, 0, 0, 1, 1},
  {0, 1, 0, 0, 0, 0},
  {0, 0, 0, 1, 0, 0},
  {0, 0, 0, 0, 0, 1}
};

int v[N+1]; /* 訪問フラグ */

void
visit(int i);

int
main(int argc, char *argv[]){
  int i, j, k;

  /* 隣接行列を出力する */
  printf("Adjacency Matrix:\n");
  for(i = 1; i <= N; i++){
    for(j = 1; j <=N; j++){
      printf("%d ", a[i][j]);
    }
    printf("\n");
  }

  printf("\nOutput Graph:\n");
  for(k = 1; k <= N; k++){
    for(i = 1; i <= N; i++){
      v[i] = 0;
    }
    visit(k);
    printf("\n");
  }
  
  return 0;
}

void
visit(int i){
  int j;
  
  v[i] = 1;

  
  for(j = 1;j <= N; j++){
    /* 隣接行列 a[i][j] が 1 でかつ 訪問フラグ v[j] が 0 */
    if(a[i][j] == 1 && v[j] == 0){
      printf("%d->%d ", i, j);
      visit(j);
    }
  }
}
