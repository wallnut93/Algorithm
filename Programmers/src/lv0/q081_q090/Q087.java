package lv0.q081_q090;

public class Q087 {
	/*
	 *숫자들이 공백으로 구분된 문자열이 주어집니다. 
	 *문자열에 있는 숫자를 차례대로 더하려고 합니다. 
	 *이 때 “Z”가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 
	 *숫자와 “Z”로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요. 
	 */
	
	public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.split(" ").length; i++) {
        	if(s.split(" ")[i].equals("Z")) {
        		if(i == 0) {
        			continue;
        		}else {
        			try {
        				answer -= Integer.parseInt(s.split(" ")[i-1]);
					} catch (Exception e) {
						answer -= Integer.parseInt(s.split(" ")[i-3]);
					}
        		}
        	}else {
        		answer += Integer.parseInt(s.split(" ")[i]);
        	}
        }
        return answer;
    }
}
