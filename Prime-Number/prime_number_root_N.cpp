#include<iostream>
#include<math.h>
using namespace std;

int main()
{
  int n;
  bool prime = true;
  cout<<"Enter a positive integer (n<2147483647) :";
  cin>>n;

  for(int i = 2;i <= sqrt(n);i++)
   {
     if(n%i == 0)
       {
         prime = false;
         break;
       }
   }
   if(prime)
       cout<<"It's a prime number!\n";
   else
       cout<<"It's not a prime number!\n";

  return 0;
}
