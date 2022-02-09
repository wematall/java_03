package su.atokmakov.lesson_01_hw;

import java.util.Arrays;
import java.util.List;

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


        // Задание 2
        // Написать метод, который преобразует массив в ArrayList;
        System.out.println();
        System.out.println("Task 2");
        System.out.println("Array before conversion");
        System.out.println(myArr.getClass());
        List<String> list = convertArrayToArrayList(myArr);
        System.out.println("After conversion");
        System.out.println(list.getClass());

        // Задание 3
        // Fruits and boxes



    }

    // Задание 1
    // Написать метод, который меняет два элемента массива местами
    // (массив может быть любого ссылочного типа);
    public static <T> void swapItemsInArray(T[] arr, int index1, int index2) {
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }

    // Задание 2
    // Написать метод, который преобразует массив в ArrayList;

    public static <T> List<T> convertArrayToArrayList(T[] arr) {
        List<T> list = Arrays.asList(arr);

        return list;
    }
}
