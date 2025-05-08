#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    int N;

    scanf("%d", &N);

    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N - i; j++) {
            printf(" ");
        }

        for (int p = 1; p <= i; p++) {
            printf("*");
        }

        printf("\n");
    }

    return 0;
}
