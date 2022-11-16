package lv0.q061_q070;

public class Q063 {
	/*
	 *문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
	 *만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요. 
	 */
	
	public int solution(String before, String after) {
		int index = 0;
		int lastIndex = after.length()-1;
		
		while(index < before.length()) {
			if(before.charAt(index) != after.charAt(lastIndex)) {
				return 0;				
			}else {
				index++;
				lastIndex--;
			}
		}
		return 1;
    }
}
