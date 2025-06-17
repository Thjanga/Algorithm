#include <string>
#include <vector>
#include <cmath>
using namespace std;

long long solution(int k, int d) {
    long long answer = 0;
    long long dd = 1LL * d * d; // 반지름 제곱
    long long maxA = d / k; // a의 최대값
    for (long long a = 0; a<=maxA; a++) {
        long long x = a * k;
        long long maxB = floor(sqrt(dd - x*x) / k ); // x^2+y^2<=d^2 b의 최대값
        answer += (maxB + 1);
    }
    return answer;
}