package lv0.q091_q100;

import java.util.ArrayList;
import java.util.List;

public class Q098 {
	/*
	 * 빨간색, 초록색, 파란색 선분이 x축 위에 있습니다. 
	 * 세 선분의 x좌표 시작과 끝이 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 
	 * 두 개 이상의 선분이 겹치는 부분의 길이를return 하도록 solution 함수를 완성해보세요.
	 * lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
	 * 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 2만큼 겹쳐있습니다.
	 */
	
	public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < lines.length; i++) {
        	for(int j = lines[i][0]; j < lines[i][1]; j++) {
        		if(list.contains(j)) {
        			list.remove(Integer.valueOf(j));
        			answer ++;
        		}else {
        			list.add(j);
        		}
        	}
        }
        return answer;
    }
}
