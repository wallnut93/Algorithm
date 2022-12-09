package lv0.q081_q090;

import java.util.Arrays;
import java.util.Collections;
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
		Integer[] rank = new Integer[score.length];
		for(int i = 0; i < score.length; i++){
			int sum = score[i][0] + score[i][1];
			answer[i] = sum;
			rank[i] = sum;
		}

		Arrays.sort(rank, Collections.reverseOrder());
		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < rank.length; i++){
			if(map.containsKey(rank[i])){
				continue;
			}else{
				map.put(rank[i], i+1);
			}
		}

		for(int i = 0; i < answer.length; i++){
			answer[i] = map.get(answer[i]);
		}
        return answer;
    }
}