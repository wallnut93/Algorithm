package lv0.q081_q090;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q090 {
	/*
	 * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
	 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 
	 * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = (score[i][0]+score[i][1])/2;
        }
        
        int arr[] = Arrays.copyOf(answer, answer.length);
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = arr.length-1; i >= 0; i--) {
        	if(!map.containsKey(arr[i])) {
        		map.put(arr[i], map.size()+1);
        	}else {
        		if(map.containsKey(arr[i])) {
        			map.put(arr[i], map.get(arr[i-1]));        			
        		}else {
        			map.put(arr[i], map.size()+1);
        		}
        	}
        }
        return answer;
    }
}
