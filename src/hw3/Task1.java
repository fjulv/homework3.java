package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.sort;

//Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static int[] sortArray(int[] array1) {
        if (array1 == null) {
            return null;
        }
        if (array1.length < 2) {
            return array1;
        }
        int[] array2 = new int[array1.length / 2];
        System.arraycopy(array1, 0, array2, 0, array1.length / 2);

        int[] array3 = new int[array1.length - array1.length / 2];
        System.arraycopy(array1, array1.length / 2, array3, 0, array1.length - array1.length / 2);

        array2 = sortArray(array2);
        array3 = sortArray(array2);
        return mergeArray(array2, array3);
    }

    public static int[] mergeArray(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];
        int positionA = 0, positionB = 0;

        for (int i = 0; i < array3.length; i++) {
            if (positionA == array1.length) {
                array3[i] = array2[positionB];
                positionB++;
            } else if (positionB == array2.length) {
                array3[i] = array1[positionA];
                positionA++;
            } else if (array1[i - positionA] < array2[i - positionB]) {
                array3[i] = array1[positionA];
                positionB++;
            } else {
                array3[i] = array2[positionB];
                positionA++;
            }
        }
        return array3;

    }


    private static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
    }















}







