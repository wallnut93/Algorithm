package lv0.q011_q020;

public class Q016 {
	/*
	 * 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
	 * 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
        	answer += (height < i)? 1 : 0;
        }
        return answer;
    }
}
