package org.example;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс PerformanceTester используется для тестирования производительности ArrayList и LinkedList.
 */
public class PerformanceTester {
    /**
     * Метод testArrayList тестирует производительность ArrayList путем измерения времени, затраченного на операции add, delete, get и sort.
     */
    public static void testArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
          Переменная startTime используется для фиксирования времени начала операций,
          переменная endTime - для фиксирования времени завершения операций.
          Для вычисления времени, затраченного на операцию нужно из времени завершения операции вычесть время начала операции.
         */

        /*
          Вычисление времени, затраченного на операцию add.
         */
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long addTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию delete.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        long deleteTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию get.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            if (!arrayList.isEmpty()) {
                arrayList.get(i % arrayList.size());
            }
        }
        endTime = System.nanoTime();
        long getTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию sort.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            java.util.Collections.sort(arrayList);
        }
        endTime = System.nanoTime();
        long sortTime = endTime - startTime;

        System.out.println("ArrayList:");
        System.out.println("Add: 1000 times, " + addTime + " ns");
        System.out.println("Delete: 1000 times, " + deleteTime + " ns");
        System.out.println("Get: 1000 times, " + getTime + " ns");
        System.out.println("Sort: 1000 times, " + sortTime + " ns");
    }

    /**
     * Метод testLinkedList тестирует производительность LinkedList путем измерения времени, затраченного на операции add, delete, get и sort.
     */
    public static void testLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        /*
          Вычисление времени, затраченного на операцию add.
         */
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        long addTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию delete.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.removeLast();
        }
        endTime = System.nanoTime();
        long deleteTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию get.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            if (!linkedList.isEmpty()) {
                linkedList.get(i % linkedList.size());
            }
        }
        endTime = System.nanoTime();
        long getTime = endTime - startTime;

        /*
          Вычисление времени, затраченного на операцию sort.
         */
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            java.util.Collections.sort(linkedList);
        }
        endTime = System.nanoTime();
        long sortTime = endTime - startTime;

        System.out.println("LinkedList:");
        System.out.println("Add: 1000 times, " + addTime + " ns");
        System.out.println("Delete: 1000 times," + deleteTime + " ns");
        System.out.println("Get: 1000 times, " + getTime + " ns");
        System.out.println("Sort: 1000 times, " + sortTime + " ns");
    }
}
