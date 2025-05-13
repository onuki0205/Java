#include<iostream>
using namespace std;
static const int MAX =200000;
int max(int,int);
int min(int,int);

int main(){
  int R[MAX],n;

  cin >> n;
  for(int i=0;i<n;i++) cin >> R[i];

  int maxv = -20000000;
  int minv = R[0];

  for(int i =1;i<n;i++){
    maxv = max(maxv,R[i]-minv);
    minv = min(minv,R[i]);
  }

  cout << maxv <<endl;

  return 0;
}

int max(int a,int b){
  if(a>=b)return a;
  else return b;
}
int min(int a,int b){
  if(a>=b)return b;
  else return a;
}
