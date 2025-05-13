#include<iostream>
#include<stack>
using namespace std;

static const int N=6;
static const int WHITE=0;
static const int GRAY=1;
static const int BLACK=2;

int n;
int color[N], d[N], f[N], tt;
int nt[N];
int m[N][N]={
       {0,1,0,1,0,0},
       {0,0,0,0,1,0},
       {0,0,0,0,1,1},
       {0,1,0,0,0,0},
       {0,0,0,1,0,0},
       {0,0,0,0,0,1}
   }; 

int next(int u){
    for(int v=nt[u];v<n;v++){
        nt[u]=v+1;
        if(m[u][v])return v;
    }
    return -1;
}

void dfs_visit(int r){
    for(int i=0;i<n;i++)nt[i]=0;

    stack<int> S;
    S.push(r);
    color[r]=GRAY;
    d[r]=tt++;

    while (!S.empty())
    {
        int u=S.top();
        int v=next(u);
        if(v != -1){
            if(color[v]==WHITE){
                color[v]=GRAY;
                d[v]=tt++;
                S.push(v);
            }
        }else{
            S.pop();
            color[u]=BLACK;
            f[u]=tt++;
        }   
    }
}

int main(){
   n = 6;
   int i;
    for(i=0;i<n;i++){
        color[i]=WHITE;
        nt[i]=0;
    }
    tt=0;

    for(int u=0;u<n;u++){
        if(color[u]==WHITE)dfs_visit(u);
    }

    for(i=0;i<n;i++){
        cout << i+1 << " " << d[i]+1 << " " << f[i]+1 << endl;
    }

   return 0;
}