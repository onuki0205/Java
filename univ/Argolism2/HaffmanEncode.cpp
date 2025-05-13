#include<iostream>
using namespace std;

struct Node{
    int key;
    Node *right, *left, *parent;
};

struct Letter{
    char C[13]={'S','H','U','N','S','U','K','E','O','N','U','K','I'};
    int size = 13;
} ;

Node *root, *NIL;

int main(){
    char C[]={'S','H','U','N','S','U','K','E','O','N','U','K','I'};
    int n = C.size;
Q = priority_queue()
for i = 1 to n
    n = node(C[i])
    Q.push(n)
end for
while Q.size() is not equal to 1
    Z = new node()
    Z.left = x = Q.pop
    Z.right = y = Q.pop
    Z.frequency = x.frequency + y.frequency
    Q.push(Z)
end while
Return Q
    return 0;
}