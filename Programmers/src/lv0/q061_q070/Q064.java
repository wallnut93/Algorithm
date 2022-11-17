package lv0.q061_q070;

public class Q064 {
	/*
	 * 문자열 my_string이 매개변수로 주어집니다. 
	 * my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public String solution(String my_string) {
        String answer = "";
        while(my_string.length() > 0) {
        	answer += my_string.charAt(0);
        	my_string = my_string.replace(""+my_string.charAt(0), "");
        }
        return answer;
    }
}
