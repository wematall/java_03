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
        System.out.println("***************************");
        System.out.println("***************************");

        Apple apple   = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        for (int i = 0; i < 3; i++) {
            appleBox1.add(new Apple());
        }

        for (int i = 0; i < 5; i++) {
            orangeBox1.add(new Orange());
        }

        System.out.println("Weight of box oranges: " + orangeBox1.getWeight());
        System.out.println("Weight of box apples: " + appleBox1.getWeight());

        System.out.println("Compare boxes equal or not..." + appleBox1.compare(orangeBox1));

        appleBox1.moveFruits(appleBox2);

        System.out.println("Weight of box1 oranges" + appleBox1.getWeight());
        System.out.println("Weight of box2 apples: " + appleBox2.getWeight());
        // some extra info with special method
        orangeBox1.info();
        appleBox1.info();
        appleBox2.info();



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
