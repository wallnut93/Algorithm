package lv1.q011_020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q017 {
	/*
	 * 문자열 내림차순으로 배치하기
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution("asdf"));
	}
	
	static String solution(String s) {
		List<Character> list = new ArrayList<>();
		
		for(char c : s.toCharArray()) {
			list.add(c);
		}
		
		list.sort(Collections.reverseOrder());
		
		String answer = "";
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
        return answer;
    }
}
