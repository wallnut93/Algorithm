package lv0.q041_q050;

public class Q041 {
	/*
	 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(String my_string) {
		int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        for(char c : my_string.toCharArray()) {
        	answer += (c-48);
        }
        return answer;
    }
}
