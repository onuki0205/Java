#include<stdio.h>
#define int MAX = 200000;
int max(int,int);
int min(int,int);

int main(){
  int r[MAX],n,i;

  scanf("%d",&n);
  for(i=0;i<n;i++)scanf("%d",&r[i]);

  int maxv = -2000000;
  int minv = r[0];

  for(i=1;i<n;i++){
    maxv = max(maxv, r[i]-minv);
    minv = min(minv, r[i]);
  }

  printf("%d\n",maxv);

  return 0;
}

int max(a,b){
  if(a>=b)return a;
  else return b;
}
int min(a,b){
  if(a>=b)return b;
  else return a;
}
