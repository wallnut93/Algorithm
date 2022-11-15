package lv0.q051_q060;

public class Q053 {
	/*
	 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, 
	 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public String solution(String my_string, int num1, int num2) {
        String answer = 
        		my_string.substring(0,num1) + my_string.charAt(num2) + my_string.substring(num1+1,num2) 
        		+ my_string.charAt(num1) + my_string.substring(num2+1);
         
        return answer;
    }
}
