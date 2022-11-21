package lv0.q071_q080;

import java.util.ArrayList;
import java.util.List;

public class Q073 {
	/*
	 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public String[] solution(String my_str, int n) {
		List<String> list = new ArrayList<>();
		while(my_str.length() > 0) {
			if(my_str.length() < n) {
				list.add(my_str);
				break;
			}else {
				list.add(my_str.substring(0,n));
				my_str = my_str.substring(n);
			}
		}
		String answer[] = list.toArray(new String[list.size()]);
        return answer;
    }
}
