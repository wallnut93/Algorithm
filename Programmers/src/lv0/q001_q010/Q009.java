package lv0.q001_q010;

public class Q009 {
	/*
	 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
	 *  (수의 갯수) * (끝수+첫번째 수) / 2
	 */
	
	public int solution(int n) {
		
		int num = n/2;
        return num * num + num;
    }
}
