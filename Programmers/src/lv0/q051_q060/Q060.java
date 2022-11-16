package lv0.q051_q060;

public class Q060 {
	/*
	 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
	 * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(int n) {
        int answer = 0;
        for(int i = 4; i <= n; i++) {
        	if(i < 8 ) {
        		answer = (i == 2 || i == 3 || i == 5 || i == 7)? answer : answer+1;
        	}else {
        		answer = (i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0)? answer +1 : answer;
        	}
        }
        return answer;
    }
}
