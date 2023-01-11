package lv1.q001_q010;

public class Q007 {
	/*
	 * 평균 구하기
	 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	 */
	
	static double solution(int[] arr) {
        int sum = 0;
        for(int i : arr) {
        	sum += i;
        }
        return (double)sum/arr.length;
    }
}
