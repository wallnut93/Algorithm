package lv_0;

public class Case_1 {
    /*
     * ���� �̾� �ٿ� ���ڿ� �����
     * 
     * ���ڿ� my_string�� ���� �迭 index_list�� �Ű������� �־����ϴ�. 
     * my_string�� index_list�� ���ҵ鿡 �ش��ϴ� �ε����� ���ڵ��� ������� �̾� ���� 
     * ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
     */

     public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int index : index_list){
            answer += my_string.charAt(index);
        }
        return answer;
    }
}
