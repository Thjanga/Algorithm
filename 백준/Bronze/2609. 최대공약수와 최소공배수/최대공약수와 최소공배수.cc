#include <iostream>
using namespace std;

// 유클리드 호제법
int GCD(int a,int b) {
	int r = a % b;
	if (r != 0)
		return GCD(b, r);
	else
		return b;
}

int LCM(int a, int b) {
	return (a * b) / GCD(a, b);
}

int main() {
	int a, b;
	cin >> a >> b;
	cout << GCD(a, b) << endl;
	cout << LCM(a, b);
}