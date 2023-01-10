package lv1.q001_q010;

public class Q007 {
	public static void main(String[] args) {
		
	}
	
	static double solution(int[] arr) {
        int sum = 0;
        for(int i : arr) {
        	sum += i;
        }
        return (double)sum/arr.length;
    }
}
