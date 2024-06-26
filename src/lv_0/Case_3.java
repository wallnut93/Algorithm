package lv_0;

public class Case_3 {
    /*
     * ���ڿ� ���� �� ������
     * 
     * ���ڿ� my_string�� ������ ���� �迭 queries�� �Ű������� �־����ϴ�. 
     * queries�� ���Ҵ� [s, e] ���·�, my_string�� �ε��� s���� �ε��� e������ ��������� �ǹ��Դϴ�.
     * my_string�� queries�� ����� ������� ó���� ���� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
     */

    public String solution(String my_string, int[][] queries) {
        for(int i = 0 ; i < queries.length; i++){
            int index1         = queries[i][0];
            int index2         = queries[i][1];

            String reverseStr  = "";
            //index1�� 0�� ���� �� �־ ���ǻ���
            String frontString = (index1 > 0)? my_string.substring(0, index1) : ""; 
            //index2�� my_string�� length�� �ѱ�� ""�� ��ȯ
            String backString  = my_string.substring(index2 + 1); 

            //������ ���ڿ� ����
            for(int j = index2; j >= index1; j--){
                reverseStr += my_string.charAt(j);
            }

            my_string = frontString + reverseStr + backString;
        }

        return my_string;
    }

    /*
     * �ٸ� Ǯ�� : �ξ� ������..
     */

     /*
     public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query : queries) {
            int index1 = query[0];
            int index2 = query[1];

            while(index1 < index2){
                char tmp = arr[index1];
                //���� �������� arr[index] ���� �� index ������
                arr[index1++] = arr[index2];
                arr[index2--] = tmp;
            }
        }

        return new String(arr);
    }
     */
}
