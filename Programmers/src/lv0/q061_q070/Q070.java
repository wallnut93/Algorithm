package lv0.q061_q070;

import java.util.Arrays;

public class Q070 {
	/*
	 * 문자열 s가 매개변수로 주어집니다. 
	 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 
	 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
	 */
	
	public String solution(String s) {
		String answer = "";
		while(s.length() > 0) {
			String subString = s.substring(1);
			if(subString.contains("" + s.charAt(0))) {
				s = s.replace("" + s.charAt(0), "");
			}else {
				answer += s.charAt(0);
				s = subString;
			}
		}
		
		char arr[] = answer.toCharArray();
		Arrays.sort(arr);
		answer = "";
		for(char c : arr) {
			answer += (""+c);
		}
        return answer;
    }
}
