package lv0.q091_q100;

public class Q094 {
	/*
	 * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
	 */
	
	public int solution(int[] common) {
        int num1 = common[1] - common[0];
        int num2 = common[2] - common[1];
        
        if(num1 == num2) {
        	return common[common.length-1] + num1;
        }else {
        	num1 = common[1] / common[0];
        	return common[common.length-1] * num1;
        }
    }
}
