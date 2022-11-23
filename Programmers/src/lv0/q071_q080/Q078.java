package lv0.q071_q080;

public class Q078 {
	/*
	 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
	 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
	 * 
	 * 연산자는 +, -만 존재합니다.
	 * 문자열의 시작과 끝에는 공백이 없습니다.
	 * 0으로 시작하는 숫자는 주어지지 않습니다.
	 * 잘못된 수식은 주어지지 않습니다.
	 */
	
	public int solution(String my_string) {
		String sArr[] = my_string.split(" ");
        int answer = Integer.parseInt(sArr[0]);
        for(int i = 0; i < sArr.length; i++) {
        	if(sArr[i].equals("+")) {
        		answer += Integer.parseInt(sArr[i+1]);
        	}else if(sArr[i].equals("-")){
        		answer -= Integer.parseInt(sArr[i+1]);
        	}else {
        		continue;
        	}
        }
        return answer;
    }
}