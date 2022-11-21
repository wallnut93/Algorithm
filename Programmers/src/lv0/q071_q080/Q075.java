package lv0.q071_q080;

public class Q075 {
	/*
	 * 문자열 my_string이 매개변수로 주어집니다. 
	 * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
	 * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        System.out.println(my_string);
        for(String s : my_string.split(" ")) {
        	answer = (!s.equals(""))? answer + Integer.parseInt(s) : answer;
        }
        return answer;
    }
}
