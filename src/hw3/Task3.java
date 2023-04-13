package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void searchInList() {
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 101));
        }
        System.out.println(list);
        int max = Collections.max(list);
        System.out.println("Максимальный элемент списка = " + max);
        int min = Collections.min(list);
        System.out.println("Минимальный элемент списка = " + min);

        float sum = 0;
        for (int item : list) {
            sum += item;
        }
        System.out.println("Среднее значение элементов списка = " + sum / list.size());


    }
}
