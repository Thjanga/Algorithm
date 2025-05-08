#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int num,first,sub,f_num,sum;
	int cnt = 0;

	scanf("%d", &num);

	if (num < 10) {
		num *= 10;
	}
	
	f_num = num;

	while (1) {
		first = (num/10);
		sub = num - (first*10);
		sum = first + sub;
		if (sum >= 10)
			sum -= 10;
		num = (sub*10)+sum;
		cnt++;
		if (num == f_num)
			break;	
	}

	printf("%d", cnt);

	return 0;
}