package lv0.q041_q050;

public class Q049 {
	/*
	 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int n) {
        String s = "";
        for(int i = 1; i <= n; i++) {
        	s += (n%i == 0)? i+"," : "";
        }
        
        int answer[] = new int[s.split(",").length];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Integer.parseInt(s.split(",")[i]);
        }
        return answer;
    }
}
