#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int a,b,b2;
	int one, two, three;

	scanf("%d", &a);
	scanf("%d", &b);
	
	b2 = b;

	one = a * (b2 % 10);
	b2 /= 10;
	two = a * (b2 % 10);
	b2 /= 10;
	three = a * (b2 % 10);

	printf("%d\n",one);
	printf("%d\n",two);
	printf("%d\n",three);
	printf("%d",a*b);
	return 0;
}