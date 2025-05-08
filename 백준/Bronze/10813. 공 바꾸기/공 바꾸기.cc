#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
	int N, M,p,q,temp;
	int num[100];

	scanf("%d %d", &N, &M);

	for (int i = 0; i < N; i++) {
		num[i] = i + 1;
	}

	for (int i = 0; i < M; i++) {
		scanf("%d %d",&p,&q);
		temp = num[p-1];
		num[p-1] = num[q-1];
		num[q-1] = temp;
	}

	for (int i = 0; i < N; i++) {
		printf("%d ", num[i]);
	}
	return 0;
}