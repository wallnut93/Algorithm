package lv1.q031_040;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q039 {
	/*
	 * 문자열 내 마음대로 정렬하기
	 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
	 * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 
	 * 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	 */
	
	public static void main(String[] args) {
		String[] arr = {"abcd", "abce", "cdx"};
		System.out.println(solution(arr, 2));
	}
	
	static public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		int index = 0;
		for(String s : strings) {
			answer[index] = ""+ s.charAt(n) + s;
			index ++;
		}
		
		Arrays.sort(answer);
		index = 0;
		
		for(String a : answer) {
			answer[index] = a.substring(1);
			index ++;
		}
        
        return answer;
    }
}
