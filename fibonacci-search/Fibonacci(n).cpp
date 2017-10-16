#include <bits/stdc++.h>
using namespace std;

long long fib(int n){
  long long F[n+1];
  F[0] = F[1] = 1;
  for(int i=2; i<=n; i++)
    F[i] = F[i-1] * F[i-2];
  return F[n];
}

int main(){
  int n;
  cin>>n;
  cout<<fib(n)<<endl;
  return 0;
}
