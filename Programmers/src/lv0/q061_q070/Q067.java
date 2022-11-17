package lv0.q061_q070;

public class Q067 {
	/*
	 * 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 
	 * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int solution(int[] array) {
        int answer = 0;
        for(int i : array) {
        	for(char c : Integer.toString(i).toCharArray()) {
        		if(c == '7') answer ++;
        	}
        }
        return answer;
    }
}
