package lv0.q081_q090;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q089 {
	/*
	 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
	 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
	 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int[] solution(int[] numlist, int n) {
		Map<Double, Integer> map = new HashMap<>();
		for(int i = 0; i < numlist.length; i++){
			int abs = Math.abs(n - numlist[i]);
			if(!map.containsKey((double)abs)){
				map.put((double)abs, numlist[i]);
			}else{
				int value = map.get((double)abs);
				if(value > numlist[i]){
					map.put((double)abs + 0.1, numlist[i]);
				}else{
					map.put((double)abs + 0.1, value);
					map.put((double)abs, numlist[i]);
				}
			}
		}

		String s = "";
		for(double key : map.keySet()){
			s += (key + ",");
		}
		
		double[] arr = new double[numlist.length];
		for(int i = 0; i < arr.length; i++){
			arr[i] = Double.parseDouble(s.split(",")[i]);
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++){
			numlist[i] = map.get(arr[i]);
		}
        return numlist;
    }
}