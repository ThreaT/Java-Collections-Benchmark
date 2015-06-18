package com.java.generics.benchmark;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    private static HashSet<Integer> HashSet_1_Million = new HashSet<>();
    private static TreeSet<Integer> TreeSet_1_Million = new TreeSet<>();
    private static LinkedHashSet<Integer> LinkedHashSet_1_Million = new LinkedHashSet<>();
    private static HashSet<Integer> HashSet_10_Million = new HashSet<>();
    private static TreeSet<Integer> TreeSet_10_Million = new TreeSet<>();
    private static LinkedHashSet<Integer> LinkedHashSet_10_Million = new LinkedHashSet<>();

    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        HashSet_Create_1_Million();
        TreeSet_Create_1_Million();
        LinkedHashSet_Create_1_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Create_10_Million();
        TreeSet_Create_10_Million();
        LinkedHashSet_Create_10_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Read_1_Million();
        TreeSet_Read_1_Million();
        LinkedHashSet_Read_1_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Read_10_Million();
        TreeSet_Read_10_Million();
        LinkedHashSet_Read_10_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Update_1_Million();
        TreeSet_Update_1_Million();
        LinkedHashSet_Update_1_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Update_10_Million();
        TreeSet_Update_10_Million();
        LinkedHashSet_Update_10_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Delete_1_Million();
        TreeSet_Delete_1_Million();
        LinkedHashSet_Delete_1_Million();
        System.out.println("-------------------------------------------------");
        HashSet_Delete_10_Million();
        TreeSet_Delete_10_Million();
        LinkedHashSet_Delete_10_Million();
    }

    public static void HashSet_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            HashSet_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSet_1_Million.size());
    }

    public static void TreeSet_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            TreeSet_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSet_1_Million.size());
    }

    public static void LinkedHashSet_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedHashSet_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSet_1_Million.size());
    }

    public static void HashSet_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            HashSet_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSet_10_Million.size());
    }

    public static void TreeSet_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            TreeSet_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSet_10_Million.size());
    }

    public static void LinkedHashSet_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedHashSet_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSet_10_Million.size());
    }

    public static void HashSet_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = HashSet_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void TreeSet_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = TreeSet_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedHashSet_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedHashSet_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void HashSet_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = HashSet_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void TreeSet_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = TreeSet_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedHashSet_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedHashSet_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void HashSet_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        HashSet<Integer> newHashSet = new HashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = HashSet_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newHashSet.add(updatedValue);
            updatedValue++;
        }
        HashSet_1_Million = newHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void TreeSet_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = TreeSet_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newTreeSet.add(updatedValue);
            updatedValue++;
        }
        TreeSet_1_Million = newTreeSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedHashSet_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedHashSet_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedHashSet.add(updatedValue);
            updatedValue++;
        }
        LinkedHashSet_1_Million = newLinkedHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void HashSet_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        HashSet<Integer> newHashSet = new HashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = HashSet_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newHashSet.add(updatedValue);
            updatedValue++;
        }
        HashSet_10_Million = newHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void TreeSet_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = TreeSet_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newTreeSet.add(updatedValue);
            updatedValue++;
        }
        TreeSet_10_Million = newTreeSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedHashSet_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        LinkedHashSet<Integer> newLinkedHashSet = new LinkedHashSet<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedHashSet_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedHashSet.add(updatedValue);
            updatedValue++;
        }
        LinkedHashSet_10_Million = newLinkedHashSet;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void HashSet_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            HashSet_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSet_1_Million.size());
    }

    public static void TreeSet_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            TreeSet_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSet_1_Million.size());
    }

    public static void LinkedHashSet_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedHashSet_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSet_1_Million.size());
    }

    public static void HashSet_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            HashSet_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashSet_10_Million.size());
    }

    public static void TreeSet_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            TreeSet_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeSet_10_Million.size());
    }

    public static void LinkedHashSet_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedHashSet_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashSet delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashSet_10_Million.size());
    }

}
