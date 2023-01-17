package lv1.q021_030;

public class Q023 {
	/*
	 * 자연수 뒤집어 배열로 만들기
	 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution(12345));
	}
	static public int[] solution(long n) {
		String s = "";
		
		while(n != 0) {
			s += (n%10);
			n /= 10;
		}
		
		int[] answer = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			answer[i] = s.toCharArray()[i] -'0';
		}
		
        return answer;
    }
}
