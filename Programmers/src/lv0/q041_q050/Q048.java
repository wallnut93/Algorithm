package lv0.q041_q050;

public class Q048 {
	/*
	 * 문자열 my_string이 매개변수로 주어질 때, 
	 * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
	 * 대문자 조건 : c-0 < 97
	 */
	
	public String solution(String my_string) {
        String answer = "";
        for(char c : my_string.toCharArray()) {
        	answer += (c-0 < 97)? (char)(c+32) : (char)(c-32);
        }
        return answer;
    }
}
