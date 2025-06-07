#include <iostream>
using namespace std;

typedef struct {
	int data[1000000];
	int top;
}Stack;

Stack s;

void init(Stack* s) {
	 s->top = -1;
}

bool empty(Stack *s) {
	return s->top == -1;
}

void push(Stack *s, int item) {
	 s->data[++s->top] = item;
}

void pop(Stack *s) {
	if (empty(s)) {
		cout << -1 << '\n';
		return;
	}
	else
		cout << s->data[s->top--] << '\n';
}

int peek(Stack *s) {
	if (empty(s)) {
		return -1;
	}
	return s->data[s->top];
}

int size(Stack* s) {
	return s->top + 1;
}

int main() {
	// 최적화
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int N;
	cin >> N;

	init(&s);
	string cmd;

	for (int i = 0; i < N; i++) {
		cin >> cmd;
		if (cmd == "1") {
			int x;
			cin >> x;
			push(&s, x);
		}
		else if (cmd == "2") {
			pop(&s);
		}
		else if (cmd == "3") {
			cout << size(&s) << '\n';
		}
		else if (cmd == "4") {
			cout << empty(&s) << '\n';
		}
		else if (cmd == "5") {
			cout << peek(&s) << '\n';
		}
	}
}