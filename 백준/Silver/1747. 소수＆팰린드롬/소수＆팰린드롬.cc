#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Prime(int n) {
    if (n < 2) return 0;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

int Palin(int m) {
    int original = m;
    int rev = 0;
    int re;
    while (m != 0) {
        re = m % 10;
        rev = rev * 10 + re;
        m /= 10;
    }
    return rev == original;
}

int main() {
    int N;
    scanf("%d", &N);
    while (1) {
        if (Prime(N) && Palin(N)) {
            printf("%d", N);
            break;
        }
        N++;
    }
    return 0;
}
