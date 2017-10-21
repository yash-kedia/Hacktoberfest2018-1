#include <stdio.h>

int main(void) {
	printf("Input number to be checked : ");
	int num;
	scanf("%d",&num);
	
	int i;
	
	for (i=2;i<=num/2;i++){
		if(num%i==0){
			printf("\n Not Prime Number ");
			break;
		}
	}
	if(i>num/2){
		printf("Prime number");
	}
	return 0;
}
