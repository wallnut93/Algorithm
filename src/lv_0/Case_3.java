package lv_0;

public class Case_3 {
    /*
     * 문자열 여러 번 뒤집기
     * 
     * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. 
     * queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
     * my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
     */

    public String solution(String my_string, int[][] queries) {
        for(int i = 0 ; i < queries.length; i++){
            int index1         = queries[i][0];
            int index2         = queries[i][1];

            String reverseStr  = "";
            //index1이 0과 같을 수 있어서 조건생성
            String frontString = (index1 > 0)? my_string.substring(0, index1) : ""; 
            //index2는 my_string의 length를 넘기면 ""를 반환
            String backString  = my_string.substring(index2 + 1); 

            //뒤집은 문자열 생성
            for(int j = index2; j >= index1; j--){
                reverseStr += my_string.charAt(j);
            }

            my_string = frontString + reverseStr + backString;
        }

        return my_string;
    }
}
