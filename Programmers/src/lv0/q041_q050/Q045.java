package lv0.q041_q050;

public class Q045 {
	/*
	 *정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 
	 *numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요. 
	 */
	
	public int[] solution(int n, int[] numlist) {
		int len = 0;
		
		for(int i = 0; i < numlist.length; i++) {
			numlist[i] = (numlist[i]%n == 0)? numlist[i] : -1;
			len += (numlist[i] != -1)? 1 : 0; 
		}
		
		int answer[] = new int[len];
		int index = 0;
		
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] != -1) {
				answer[index] = numlist[i];
				index++;
			}else {
				continue;
			}
		}
		
        return answer;
    }
}
