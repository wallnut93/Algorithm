package lv1.q041_050;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Q046 {
	/*
	 * 2016년
	 * 2016년 1월 1일은 금요일입니다. 
	 * 2016년 a월 b일은 무슨 요일일까요? 
	 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
	 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다. 
	 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
	 * 제한 조건
	 * 2016년은 윤년입니다.
	 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	 */
	
	public static void main(String[] args) {
		System.out.println(solution(5,26));
		System.out.println(121+26);
		System.out.println(147%7);
	}
	
	static public String solution(int a, int b) {
		Map<Integer, Integer> monthMap = new HashMap<>();
		Map<Integer, String> dayMap = new HashMap<>();
        String[] dayArr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        for(int i = 1; i <= 12; i++) {
        	if(i == 2) monthMap.put(i,29);
        	else if(i <= 7) monthMap.put(i, (i%2 == 1)? 31 : 30);
        	else monthMap.put(i, (i%2 == 0)? 31 : 30);
        }
        
        for(int i = 0; i <= 6; i++) {
        	dayMap.put(i, dayArr[i]);
        }
        
        int totaldays = b;
        
        for(int i = 1; i < a; i++) {
        	totaldays += monthMap.get(i);
        }
        
        return dayMap.get(totaldays%7);
    }
}
