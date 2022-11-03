package lv0.q011_q020;

public class Q014 {
	/*
	 * 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
	 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	 * denum1/num1 + denum2/nu2
	 */
	
	public int[] solution(int denum1, int num1, int denum2, int num2) {
		
	    int n1 = denum1*num2 + denum2*num1;
	    int n2 = num1*num2;
	    int lcm = 1;

	    for(int i = 1 ; i <= n1; i ++) {
	    	if(n1%i != 0 || n2%i != 0) {
	    		continue;
	    	}else {
	    		lcm = i;
	    	}
	    }
	    
	    int answer[] = {n1/lcm, n2/lcm};
	    return answer;
    }
}
