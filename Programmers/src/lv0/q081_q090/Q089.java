package lv0.q081_q090;

import java.util.Arrays;

public class Q089 {
	/*
	 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
	 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
	 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[] numlist, int n) {
		int answer[] = Arrays.copyOf(numlist, numlist.length);
		for(int i = 0; i < answer.length; i++) {
			for(int j = 0; j < numlist.length; j++) {
				int num1 = Math.abs(n - numlist[i]);
				int num2 = Math.abs(n - numlist[j]);
				
				if(num1 > num2) {
					answer[i] = numlist[i];
				}else if(num1 == num2) {
					answer[i] = (numlist[i] > numlist[j])? numlist[i] : numlist[j];
				}else {
					answer[i] = numlist[j];
				}
			}
		}
        return answer;
    }
}