package lv0.q081_q090;

import java.util.Arrays;

public class Q083 {
	/*
	 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 
	 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 
	 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int solution(int[][] dots) {
		int arr1[] = new int[4];
		int arr2[] = new int[4];
		for(int i = 0; i < dots.length; i++) {
			arr1[i] = dots[i][0];
			arr2[i] = dots[i][1];
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return (arr1[3]-arr1[0]) * (arr2[3]-arr2[0]);
    }
}