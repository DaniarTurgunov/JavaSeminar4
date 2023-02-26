package Seminar_4.HW;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        System.out.print(reverseList(head));
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> head) {
        for (int i = 0; i < head.size() / 2; i++) {
            Integer temp = head.get(i);
            head.set(i, head.get(head.size() - i - 1));
            head.set(head.size() - i - 1, temp);
        }
        return head;
    }
}