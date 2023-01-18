package lv1.q021_030;

public class Q029 {
	/*
	 * 문자열 다루기 기본
	 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	 */
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
	
	static public boolean solution(String s) {
		if(s.length() != 4 && s.length() != 6) {
			return false;
		}else {
			try {
				int i = Integer.parseInt(s);
				System.out.println(i);
				return true;
			}catch (Exception e) {
				return false;
			}
		}
    }
}
