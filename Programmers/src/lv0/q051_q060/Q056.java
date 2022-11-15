package lv0.q051_q060;

public class Q056 {
	/*
	 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
	 * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[] numbers, String direction) {
        int answer[] = new int[numbers.length];
        int index = (direction.equals("left"))? 1 : numbers.length-1;
        
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[index];
        	index = (index == numbers.length -1)? 0 : index+1;
        }
        return answer;
    }
}
