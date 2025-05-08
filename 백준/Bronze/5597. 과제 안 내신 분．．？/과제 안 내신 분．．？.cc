#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int num;
	int student[30] = { 0 };
	
	for (int i = 0; i < 28; i++) {
		scanf("%d", &num);
		student[num - 1] = num;
	}

	for (int i = 0; i < 30; i++) {
		if (student[i] == 0)
			printf("%d\n", i + 1);
	}
	return 0;
}