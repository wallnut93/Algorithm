package lv1.q011_020;

public class Q019 {
	/*
	 * 수박수박수박수박수박수?
	 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, 
	 * solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	
	
	public static String solution(int n) {
        return (n%2 == 0)? watermelon(n/2,"") : watermelon(n/2,"") + "수";
    }
	
	public static String watermelon(int n, String s) {		
		if(n == 0) return s;
		return watermelon(n - 1, s + "수박");
	}
}
