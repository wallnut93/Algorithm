package lv_0;

public class Case_2 {
    /*
     * 9로 나눈 나머지
     * 
     * 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
     * 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 
     * 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
     */

     public int solution(String number) {
        int answer = 0;
        for(char c : number.toCharArray()){
            //int 형변환 없이 더하는 경우 아스키코드 값을 더하기 때문에 '0'을 빼준다
            answer += (c - '0');
        }
        return answer % 9;
    }
}
