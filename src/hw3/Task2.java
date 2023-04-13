package hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {

    public static void oddNumbers() {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 101));
        }
        System.out.println(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);

        // Второй вариант:

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(rd.nextInt(1, 101));
        }
        System.out.println(list2);

        for (Iterator<Integer> iterator = list2.iterator(); iterator.hasNext(); ) {
            if (iterator.next() % 2 == 0) iterator.remove();
        }
        System.out.println(list2);

    }
}

