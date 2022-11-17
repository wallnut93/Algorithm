package lv0.q061_q070;

import java.util.*;

public class Q069 {
	/*
	 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
	 * 정수 배열 emergency가 매개변수로 주어질 때 
	 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[] emergency) {
		Integer arr[] = new Integer[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < emergency.length; i++) {
        	map.put(emergency[i], i);
        	arr[i] = emergency[i];
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = map.get(arr[i]);
        }
        
        int answer[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
        	answer[i] = arr[i];
        }
        return answer;
    }
}
