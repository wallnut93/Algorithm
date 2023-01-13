package lv1.q011_020;

public class Q016 {
	/*
	 * 하샤드 수
	 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
	 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	 */
	
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			System.out.println(String.format("%d는 %b\n", i, solution(i)));		
		}
	}
	
	static boolean solution(int x) {
        return (x%harshad(x, 0) == 0)? true : false;
    }
	
	static int harshad (int num, int sum) {
		if(num < 10) {
			return sum + num;
		}else {
			return harshad(num/10, sum + num%10);
		}
	}
}
