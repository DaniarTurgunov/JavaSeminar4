package Seminar_4.CW;

import java.util.Arrays;
import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) sum += list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) list.set(i, sum);
            {
                System.out.println("Лист после изменений = " + list);
            }
        }
    }
}
