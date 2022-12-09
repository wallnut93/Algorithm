package lv0.q091_q100;

import java.util.ArrayList;
import java.util.List;

public class Q099 {
	/*
	 * 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
	 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
	 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
	 */
	
	// y증가량 / x 증가량 = 기울기
	public int solution(int[][] dots) {
		List<Double> giulgis = new ArrayList<>();
		for(int i = 0; i < dots.length -1; i++){
			for(int j = i + 1; j < dots.length; j++){
				int x = dots[j][0] - dots[i][0];
				int y = dots[j][1] - dots[i][1];

				if(giulgis.size() > dots.length - 1 && giulgis.contains((double)y / (double)x)) return 1;
				else giulgis.add((double)y / (double)x);
			}
		}
        return 0;
    }
}
