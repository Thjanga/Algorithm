#include <iostream>
#include <stack>
using namespace std;

int main() {
	stack<int> s;
	int N,num;
	int total = 0;
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> num;
		if (num == 0) {
			s.pop();
		}
		else {
			s.push(num);
		}
	}
	while (!s.empty()) {
		total += s.top(); 
		s.pop();          
	}
	cout << total << endl;

	return 0;
}