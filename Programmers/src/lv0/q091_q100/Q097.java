package lv0.q091_q100;

public class Q097 {
	/*
	 * 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
	 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
	 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
	 */
	
	public int solution(int[][] board) {
        int answer = board.length * board.length;
        int count = 0;
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		if(board[i][j] == 0) 
        			continue;
        		else if(board[i][j] == 1){ 
        			count++;
        			int startI = (i-1 <= 0)? 0 : i-1;
        			int endI = (i+1 >= board[i].length)? board[i].length-1 : i+1;
        			int startJ = (j-1 <= 0)? 0 : j-1;
        			int endJ = (j+1 >= board.length)? board.length-1 : j+1;
        			
        			for(int a = startI; a <= endI; a++) {
        				for(int b = startJ; b <= endJ; b++) {
        					if(board[a][b] == 0) {
        						board[a][b] = -1;
        						count++;
        					}
        				}
        			}
        		}
        	}
        }
        return answer - count;
    }
}
