package lv1.q031_040;

public class Q035 {
	/*
	 * 이상한 문자 만들기
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
	 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
	 * solution을 완성하세요.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
	
	static public String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(String.valueOf(s.charAt(i)).equals(" ")) {
        		answer += " ";
        		index = 0;
        	}else {
        		answer += (index%2 == 0)? s.toUpperCase().charAt(i) : s.toLowerCase().charAt(i);
        		index ++;
        	}
        }
        return answer;
    }
}
