package lv1.q031_040;

public class Q036 {
	/*
	 * 최대공약수와 최소공배수
	 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
	 */
	
	public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), (n*m/gcd(n,m))};
        return answer;
    }
	
	public int gcd(int a, int b) {

	    // 두 정수 중 뒤의 수(나머지)가 0 이면, 앞의 수가 공약수이다.
	    if(b == 0) return a;

	    // 두 비교 수 중에 1이 있으면, 공약수가 없다.
	    if(a == 1 || b == 1) return 1;
	    
	    // 다음 함수 값을 정할 때 작은 수는 앞에 큰수를 작은수로 나눈 나머지는 뒤에
	    if(a > b) return gcd(b, a%b);
	    else return gcd(a, b%a);
	}
}
