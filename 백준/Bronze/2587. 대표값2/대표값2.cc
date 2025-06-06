#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int num[5];
	int mean, median;

	for (int i = 0; i < 5; i++) {
		cin >> num[i];
	}
	mean = (num[0] + num[1] + num[2] + num[3] + num[4])/5;

	sort(num, num + 5);
	cout << mean << endl << num[2];
}