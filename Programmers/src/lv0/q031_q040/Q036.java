package lv0.q031_q040;

public class Q036 {
	/*
	 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int n) {
        int len = (n%2 == 0)? n/2 : (int)(n/2) + 1;
        int arr[] = new int[len];
        int index = 0;
        for(int i = 1; i <= n; i++) {
        	if(i%2 ==1) {
        		arr[index] = i;
        		index++;
        	}
        }
        return arr;
    }
}
