package lv1.q021_030;

public class Q022 {
	/*
	 * 자릿수 더하기
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	 */
	
	public int solution(int n) {
        int answer = 0;
        return sum(n, answer);
    }
	
	public int sum(int n, int a) {
		if(n < 10) return a + n;
		return sum(n/10, a + n%10);
	}
}
