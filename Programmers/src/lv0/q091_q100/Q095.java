package lv0.q091_q100;

public class Q095 {
	/*
	 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
	 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
        	
        	String[] split = quiz[i].split(" ");
        	int sum = Integer.parseInt(split[0]);
        	
        	for(int j = 1; j < split.length-1; j++) {
        		if(split[j].equals("+")) {
        			sum += Integer.parseInt(split[j+1]);
        		}else if(split[j].equals("-")) {
        			sum -= Integer.parseInt(split[j+1]);
        		}else if(split[j].equals("=")){
        			answer[i] = (sum == Integer.parseInt(split[j+1]))? "O" : "X";
        		}
        	}
        	
        }
        return answer;
    }
}
