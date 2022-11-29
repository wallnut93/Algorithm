package lv0.q091_q100;

public class Q093 {
	/*
	 *한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 
	 *다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 
	 *덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 
	 *동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 
	 *같은 식이라면 가장 짧은 수식을 return 합니다. 
	 */
	
	public String solution(String polynomial) {
		int xCount = 0;
		int sum = 0;
		for(String s : polynomial.split(" ")) {
			if(s.contains("x")) {
				s = s.replace("x", "");
				if(s.equals("")) xCount++;
				else xCount += Integer.parseInt(s);
			}else if(s.equals("+")) continue;
			else sum += Integer.parseInt(s);
		}
		
		String answer = "";
		if(xCount != 0) {
			if(sum == 0) {
				answer = (xCount == 1)? "x" : xCount+"x";
			}else {
				answer = (xCount == 1)? "x" + " + " + sum : xCount+"x" + " + " + sum;
			}
		}else {
			answer += sum;
		}
        return answer;
    }
}
