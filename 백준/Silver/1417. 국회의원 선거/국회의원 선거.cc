#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int N;
	int cnt = 0;
	int num[50];
	cin >> N;

		for (int i = 0; i < N; i++) {
			cin >> num[i];
		}
		while (1) {
			int max = num[1];
			int maxidx = 1;
			for (int i = 1; i < N; i++) {
				if (num[i] > max) {
					max = num[i];
					maxidx = i;
				}
			}
			if (num[0] > max) break;

			num[maxidx]--;
			num[0]++;
			cnt++;
		}
	cout << cnt;
	}
