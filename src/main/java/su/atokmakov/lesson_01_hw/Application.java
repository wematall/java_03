package su.atokmakov.lesson_01_hw;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // Задание 1
        // Написать метод, который меняет два элемента массива местами
        // (массив может быть любого ссылочного типа);
        String[] myArr = {"a", "b", "v", "g", "d"};

        System.out.println("Origin array before swap");
        System.out.println(Arrays.toString(myArr));
        System.out.println("After swap elements");
        swapItemsInArray(myArr, 0, 4);
        System.out.println(Arrays.toString(myArr));



    }

    // Задание 1
    // Написать метод, который меняет два элемента массива местами
    // (массив может быть любого ссылочного типа);
    public static <T> void swapItemsInArray(T[] arr, int index1, int index2) {
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }
}
