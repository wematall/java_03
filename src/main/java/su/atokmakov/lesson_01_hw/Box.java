package su.atokmakov.lesson_01_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> list;

    public Box() {
        list = new ArrayList<T>();
    }

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }


    public List<T> getList() {
        return list;
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveFruits(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    // some extra info with special method
    void info() {
        if (list.isEmpty()) {
            System.out.println("Box is empty");
        } else {
            System.out.println("Box content: " + list.get(0).toString() + " Weight: " + list.size()*list.get(0).getWeight());
        }
    }
}
