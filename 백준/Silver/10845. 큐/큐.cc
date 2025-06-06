#include <iostream>
//#define MAX 10
using namespace std;

typedef struct
{
	int data[10000];
	int front, rear;
}Queue;

void init(Queue *q) {
	q->front = 0;
	q->rear = 0;
}
bool empty(Queue *q) {
	return q->front == q->rear;	
}

//bool full(Queue* q) {
//	return q->rear == MAX - 1;
//}

void push(Queue *q,int item) {
	/*if (full(q)) {
		cout << -1 << endl;
		return;
	}*/
	q -> data[(q->rear)++] = item;
	/*cout << item << endl;*/
}

void pop(Queue *q) {
	if (empty(q)) {
		cout << -1 << endl;
		return;
	}
	cout << q->data[(q->front)++] << endl;
}

void front(Queue *q) {
	if (empty(q)) {
		cout << -1 << endl;
	}
	else cout << q->data[q->front] << endl;
}

void back(Queue *q) {
	if (empty(q)) {
		cout << -1 << endl;
	}
	else cout << q->data[q->rear-1] << endl;
}

void size(Queue *q) {
	cout << q->rear-q->front << endl;
}

int main()
{
	int N;
	Queue q;
	init(&q);
	cin >> N;
	string cmd;

	for (int i = 0; i < N; ++i) {
		cin >> cmd;
		if (cmd == "push") {
			int x;
			cin >> x;
			push(&q, x);
		}
		else if (cmd == "pop") {
			pop(&q);
		}
		else if (cmd == "size") {
			size(&q);
		}
		else if (cmd == "empty") {
			cout << empty(&q) << endl;
		}
		else if (cmd == "front") {
			front(&q);
		}
		else if (cmd == "back") {
			back(&q);
		}
	}

}