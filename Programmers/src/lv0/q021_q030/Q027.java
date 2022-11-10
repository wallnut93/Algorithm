package lv0.q021_q030;

import java.util.Arrays;

public class Q027 {
	/*
	 * 정수 배열 numbers가 매개변수로 주어집니다. 
	 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length-1;
        return numbers[n] * numbers[n-1];
    }
}
