package lv0.q011_q020;

public class Q013 {
	/*
	 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public double solution(int[] numbers) {
        int sum = 0;
        for(int i : numbers) {
        	sum += i;
        }
        return (double)sum / numbers.length;
    }
}
