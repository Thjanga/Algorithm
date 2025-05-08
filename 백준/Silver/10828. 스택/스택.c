#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 10000

typedef struct {
    int data[MAX_SIZE];
    int top;
} Stack;

void init(Stack* s) {
    s->top = -1;
}

void push(Stack* s, int data) {
    if (s->top < MAX_SIZE - 1) {
        s->data[++(s->top)] = data;
    }
}

int pop(Stack* s) {
    if (s->top == -1) return -1;
    return s->data[(s->top)--];
}

int size(Stack* s) {
    return s->top + 1;
}

int empty(Stack* s) {
    return s->top == -1 ? 1 : 0;
}

int top(Stack* s) {
    if (s->top == -1) return -1;
    return s->data[s->top];
}

int main() {
    int n;
    scanf("%d", &n);
    Stack s;
    init(&s);

    char command[10];
    for (int i = 0; i < n; i++) {
        scanf("%s", command);

        if (strcmp(command, "push") == 0) {
            int data;
            scanf("%d", &data);
            push(&s, data);
        }
        else if (strcmp(command, "pop") == 0) {
            printf("%d\n", pop(&s));
        }
        else if (strcmp(command, "size") == 0) {
            printf("%d\n", size(&s));
        }
        else if (strcmp(command, "empty") == 0) {
            printf("%d\n", empty(&s));
        }
        else if (strcmp(command, "top") == 0) {
            printf("%d\n", top(&s));
        }
    }
    return 0;
}
