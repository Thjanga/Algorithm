#include <iostream>
using namespace std;

#define MAX 2000001

typedef struct{
	int front, rear;
	int data[MAX];
}Queue;

void push(Queue *q,int item) {
	q->data[++q->rear] = item;
}

void init(Queue* q) {
	q->front = q->rear = -1;
}

bool empty(Queue *q) {
	return q->front == q->rear;
}

void pop(Queue* q) {
	if (empty(q)) {
		cout << -1 << '\n';
		return;
	}
	else
		cout << q->data[++q->front] << '\n';
}

void size(Queue* q) {
	cout << q->rear - q->front << '\n';
}

void front(Queue* q) {
	if (empty(q)) {
		cout << -1 << '\n';
		return;
	}
	cout << q->data[q->front+1] << '\n';

}

void back(Queue *q) {
	if (empty(q)) {
		cout << -1 << '\n';
		return;
	}
	cout << q->data[q->rear] << '\n';
}

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);

	int N,num;
	string cmd;
	Queue q;
	init(&q);

	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> cmd;
		if (cmd == "push") {
			cin >> num;
			push(&q, num);
		}
		else if (cmd == "pop") {
			pop(&q);
		}
		else if (cmd == "size") {
			size(&q);
		}
		else if (cmd == "empty") {
			cout << empty(&q) << '\n';
		}
		else if (cmd == "front") {
			front(&q);
		}
		else if (cmd == "back") {
			back(&q);
		}
	}

	return 0;
}