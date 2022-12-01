package lv0.q071_q080;

public class Q079 {
	/*
	 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.구슬은 모두 다르게 생겼습니다. 
	 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
	 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
	 * 
	 * n!/(n-m)!*m!
	 */
	
    public int solution(int balls, int share) {
    	return count(balls, share);
    }
    
    public int count(int a, int b) {
    	if(a == b || b == 0) return 1;
    	else return count(a - 1, b -1) + count(a - 1, b);
	}
    //5,3 (123 124 125 134 135 145/6)3! + (234 235 245/3) + 345/1
    //												c4,2 + c 4,3
    //				 		  			 	 c3,1 + c3,2 + c3,2 + c3,3(1) = 1
    //			 	 	 c2,0(1) + c2,1 + c2,1 + c2,2(1) + c2,1 + c2,2(1) = 3
    //		   	 c1,0(1) + c1,1(1) + c1,0(1) + c(1,1)(1) + c1,0(1) + c1,1(1) = 6
    
    //*참조 -> 
    // https://velog.io/@jsj3282/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B5%AC%EC%8A%AC%EC%9D%84-%EB%82%98%EB%88%84%EB%8A%94-%EA%B2%BD%EC%9A%B0%EC%9D%98-%EC%88%98
}
