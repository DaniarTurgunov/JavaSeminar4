package Seminar_4.CW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class task4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,-3,4,5,-6,7,8,-9));
        for (int i = list.size()-1; i >= 0; i++) {
            if(list.get(i) < 0) list.remove(i);
        }
        System.out.println(list);
    }
}
