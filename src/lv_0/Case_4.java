package lv_0;

import java.util.*;

public class Case_4 {
    /*
     * �迭 ����� 5
     * 
     * ���ڿ� �迭 intStrs�� ���� k, s, l�� �־����ϴ�. intStrs�� ���Ҵ� ���ڷ� �̷���� �ֽ��ϴ�.
     * �迭 intStrs�� �� ���Ҹ��� s�� �ε������� �����ϴ� ���� l¥�� �κ� ���ڿ��� �߶� ������ ��ȯ�մϴ�.
     * �̶� ��ȯ�� �������� k���� ū ������ ���� �迭�� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
     */

     public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String intStr : intStrs){
            long num = Long.parseLong(intStr.substring(s,l));
            // if(num > k)

            
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
