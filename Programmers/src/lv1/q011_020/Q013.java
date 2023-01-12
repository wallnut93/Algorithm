package lv1.q011_020;

public class Q013 {
	/*
	 * 두 정수 사이의 합
	 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution(-10000000, 10000000));
		//이거는 당연히 0이 나온다... ㅋㅋ 바보다 바보 ㅋㅋㅋ
	}
	static public long solution(int a, int b) {
		if(a == b) {
			return a;
		}else {
			int small = (a < b)? a : b;
			int big = (a > b)? a : b;
			long answer = 0;
			
			for(int i = small; i <= big; i++) {
				answer += (long)(i);
			}
			
			return answer;
		}
    }
}
