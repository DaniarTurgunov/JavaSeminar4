package Seminar_4.CW;

import java.util.LinkedList;
import java.util.Scanner;

//2.	Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.
public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            linkedList.add(i);
        }
        scanner.close();
        //показать/достать элемент
        System.out.println(linkedList.peek());
        System.out.println("peek" + linkedList);
        System.out.println(linkedList.pop());
        System.out.println("pop" + linkedList);
        //добавление в начало/в конец
        linkedList.addFirst(3);
        System.out.println("addFirst"+linkedList);
        linkedList.addLast(4);
        System.out.println("addLast"+linkedList);
        linkedList.add(5);
        System.out.println("add"+linkedList);
        // Замена
        linkedList.set(0,7);
        System.out.println("change" + linkedList);
        // Проверка на наличие элемента
        linkedList.contains(7);
        System.out.println("contains" + linkedList);
        //Удаление
        linkedList.remove(5);
        System.out.println("delete 5" + linkedList);
    }
}
