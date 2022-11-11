package lv0.q041_q050;

public class Q047 {
	/*
	 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int[] solution(int[] array) {
		int answer1 = -1;
		int answer2 = -1;
		
		for(int i = 0; i < array.length; i++) {
			if(answer1 < array[i]) {
				answer1 = array[i];
				answer2 = i;
			}
		}
		
        int[] answer = {answer1, answer2};
        return answer;
    }
}
