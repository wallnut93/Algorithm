package lv_0;

public class Case_2 {
    /*
     * 9�� ���� ������
     * 
     * ���� �ƴ� ������ 9�� ���� �������� �� ������ �� �ڸ� ������ ���� 9�� ���� �������� ���� ���� �˷��� �ֽ��ϴ�.
     * �� ����� �̿��Ͽ� ���� �ƴ� ������ ���ڿ� number�� �־��� ��, 
     * �� ������ 9�� ���� �������� return �ϴ� solution �Լ��� �ۼ����ּ���.
     */

     public int solution(String number) {
        int answer = 0;
        for(char c : number.toCharArray()){
            //int ����ȯ ���� ���ϴ� ��� �ƽ�Ű�ڵ� ���� ���ϱ� ������ '0'�� ���ش�
            answer += (c - '0');
        }
        return answer % 9;
    }
}
