package lv1.q041_050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q050 {
	/*
	 * 모의고사
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		System.out.println(solution(arr));
	}
	
	static public int[] solution(int[] answers) {
        String[] supojas = {"12345","21232425", "3311224455"};
        String scores= "";
        int highScore = 0;
        
        for(int i = 0; i < supojas.length; i++) {
        	int score = getScore(supojas[i], answers);
        	scores +=  score + ",";
        	highScore = Math.max(highScore, score);
        }
        
        String rank = "";
        for(int i = 1; i <= supojas.length; i++) {
        	String score = scores.split(",")[i-1];
        	rank += (score.compareTo(String.valueOf(highScore)) >= 0)? i : "";
        }
        
        int[] answer = new int[rank.length()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Integer.parseInt(rank.split("")[i]);
        }
        
        return answer;
    }
	
	public static int getScore(String supoja, int[] answers) {
		int score = 0;
		int index = 0;
		
		for(int i = 0; i < answers.length; i++) {
			int a = Integer.parseInt(supoja.split("")[index]);
			score += (answers[i] == a)? 1 : 0;
			index = (index < supoja.length())? index + 1 : 0;
		}
		
		return score;
	}
}
