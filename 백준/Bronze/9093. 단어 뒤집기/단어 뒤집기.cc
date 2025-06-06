#include <iostream>
#include <algorithm>
#include <sstream>
using namespace std;

int main()
{
	int T;
	string s;

	cin >> T;
	cin.ignore();

	for (int i = 0; i < T; i++) {
		getline(cin, s);
		stringstream ss(s);
		string word;
		while (ss >> word) {
			reverse(word.begin(), word.end());
			cout << word << " ";
		}
		cout << endl;
	}
}