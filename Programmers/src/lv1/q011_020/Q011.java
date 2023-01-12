package lv1.q011_020;

public class Q011 {
	/*
	 * 가운데 글자 가져오기
	 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	 */
	
	public static void main(String[] args) {
		System.out.println(solution("efgh"));
		System.out.println(solution("a"));
	}
	static String solution(String s) {
		if(s.length() == 1) {
			return s;
		}
		
        int index = s.length()/2;
        String s1 = "" + s.charAt(index-1);
        String s2 = "" + s.charAt(index);
        
        return (s.length()%2 == 0)? s1 + s2 : s2;
    }
}
