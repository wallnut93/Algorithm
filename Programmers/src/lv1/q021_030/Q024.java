package lv1.q021_030;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q024 {
	/*
	 * 정수 내림차순으로 배치하기
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 */
	
	public long solution(long n) {
		String s = "";
		List<Long> list = new ArrayList<>();
		
		while(n != 0) {
			list.add(n%10);
			n/=10;
		}
		
		list.sort(Comparator.reverseOrder());
		
		for(int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		
        return Long.parseLong(s);
    }
}
