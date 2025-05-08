#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main()
{
    int total,num;
    int price, price_num;
    int sum=0;

    scanf("%d", &total);
    scanf("%d", &num);

    for (int i = 0; i < num; i++) {
        scanf("%d %d", &price, &price_num);
        sum = sum + (price * price_num);
    }
    if (sum == total)
        printf("Yes");
    else
        printf("No");

    return 0;
}