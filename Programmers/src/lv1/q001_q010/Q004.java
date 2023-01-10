package lv1.q001_q010;

public class Q004 {
	/*
	 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
	 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	 */
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,0};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] numbers) {
		int answer = 0;
		for(int i = 0; i <10; i++) {
			answer += i;
		}
		
		for(int i : numbers) {
			answer -= i;
		}
		return answer;
	}
}




