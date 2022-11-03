package lv0.q011_q020;

public class Q017 {
	/*
	 * 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
	 * 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 
	 * 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * 공백도 하나의 문자로 취급합니다.
	 * 편지지의 여백은 생각하지 않습니다.
	 * 1 ≤ message의 길이 ≤ 50
	 */
	
	public int solution(String message) {
        return message.length()*2;
    }
}
