package lv0.q081_q090;

public class Q084 {
	/*
	 *소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 
	 *분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 
	 *유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
	 *기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
	 *두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요. 
	 */
	
	public int solution(int a, int b) {
		if(a != 1 && b != 1) {
			return gongyagsu(a, b);
		}else {
			return 2;
		}
    }
	
	public int gongyagsu(int a, int b) {
		if(a%2 == 0 && b%2 == 0) {
			a /= 2;
			b /= 2;
		}else if(a%3 == 0 && b%3 == 0) {
			a /= 3;
			b /= 3;
		}else if(a%5 == 0 && b%5 == 0) {
			a /= 5;
			b /= 5;
		}else if(a%7 == 0 && b%7 == 0) {
			a /= 7;
			b /= 7;
		}else {
			return 2;
		}
		return gongyagsu(a,b);
	}
}
