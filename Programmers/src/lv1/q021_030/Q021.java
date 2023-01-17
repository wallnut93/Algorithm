package lv1.q021_030;

public class Q021 {
	/*
	 * 약수의 합
	 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	 */
	
	public static void main(String[] args) {
	}
	
	public static int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += (n%i == 0)? i : 0;
		}
		return answer;
    }
}
