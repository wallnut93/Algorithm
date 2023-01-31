package lv1.q041_050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q045 {
	/*
	 * 두 개 뽑아서 더하기
	 * 정수 배열 numbers가 주어집니다. 
	 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 
	 * 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	 * 제한사항
	 * numbers의 길이는 2 이상 100 이하입니다.
	 * numbers의 모든 수는 0 이상 100 이하입니다.
	 */
	
	public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length -1; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		int sum =numbers[i] + numbers[j];
        		if(list.contains(sum)) continue;
        		else list.add(sum);
        	}
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
