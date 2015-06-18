package com.java.generics.benchmark;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

    private static final HashMap<Integer, String> HashMap_1_Million = new HashMap<>();
    private static final TreeMap<Integer, String> TreeMap_1_Million = new TreeMap<>();
    private static final LinkedHashMap<Integer, String> LinkedHashMap_1_Million = new LinkedHashMap<>();
    private static final HashMap<Integer, String> HashMap_10_Million = new HashMap<>();
    private static final TreeMap<Integer, String> TreeMap_10_Million = new TreeMap<>();
    private static final LinkedHashMap<Integer, String> LinkedHashMap_10_Million = new LinkedHashMap<>();

    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        HashMap_Create_1_Million();
        TreeMap_Create_1_Million();
        LinkedHashMap_Create_1_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Create_10_Million();
        TreeMap_Create_10_Million();
        LinkedHashMap_Create_10_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Read_1_Million();
        TreeMap_Read_1_Million();
        LinkedHashMap_Read_1_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Read_10_Million();
        TreeMap_Read_10_Million();
        LinkedHashMap_Read_10_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Update_1_Million();
        TreeMap_Update_1_Million();
        LinkedHashMap_Update_1_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Update_10_Million();
        TreeMap_Update_10_Million();
        LinkedHashMap_Update_10_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Delete_1_Million();
        TreeMap_Delete_1_Million();
        LinkedHashMap_Delete_1_Million();
        System.out.println("-------------------------------------------------");
        HashMap_Delete_10_Million();
        TreeMap_Delete_10_Million();
        LinkedHashMap_Delete_10_Million();
    }

    public static void HashMap_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 1000000; i++) {
            HashMap_1_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashMap_1_Million.size());
    }

    public static void TreeMap_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 1000000; i++) {
            TreeMap_1_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeMap_1_Million.size());
    }

    public static void LinkedHashMap_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 1000000; i++) {
            LinkedHashMap_1_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashMap_1_Million.size());
    }

    public static void HashMap_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 10000000; i++) {
            HashMap_10_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashMap_10_Million.size());
    }

    public static void TreeMap_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 10000000; i++) {
            TreeMap_10_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeMap_10_Million.size());
    }

    public static void LinkedHashMap_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        String value = "temp value";
        for (int i = 0; i < 10000000; i++) {
            LinkedHashMap_10_Million.put(i, value);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashMap_10_Million.size());
    }

    public static void HashMap_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < HashMap_1_Million.size(); i++) {
            lastValue = HashMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void TreeMap_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < TreeMap_1_Million.size(); i++) {
            lastValue = TreeMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedHashMap_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < LinkedHashMap_1_Million.size(); i++) {
            lastValue = LinkedHashMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void HashMap_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < HashMap_10_Million.size(); i++) {
            lastValue = HashMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void TreeMap_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < TreeMap_10_Million.size(); i++) {
            lastValue = TreeMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedHashMap_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        String lastValue = "No values read.";
        for (int i = 0; i < LinkedHashMap_10_Million.size(); i++) {
            lastValue = LinkedHashMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void HashMap_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < HashMap_1_Million.size(); i++) {
            HashMap_1_Million.put(i, "updated temp value");
            updatedValue = HashMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void TreeMap_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < TreeMap_1_Million.size(); i++) {
            TreeMap_1_Million.put(i, "updated temp value");
            updatedValue = TreeMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedHashMap_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < TreeMap_1_Million.size(); i++) {
            LinkedHashMap_1_Million.put(i, "updated temp value");
            updatedValue = LinkedHashMap_1_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void HashMap_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < HashMap_10_Million.size(); i++) {
            HashMap_10_Million.put(i, "updated temp value");
            updatedValue = HashMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void TreeMap_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < TreeMap_10_Million.size(); i++) {
            TreeMap_10_Million.put(i, "updated temp value");
            updatedValue = TreeMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedHashMap_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        String updatedValue = "No values updated.";
        for (int i = 0; i < LinkedHashMap_10_Million.size(); i++) {
            LinkedHashMap_10_Million.put(i, "updated temp value");
            updatedValue = LinkedHashMap_10_Million.get(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void HashMap_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            HashMap_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashMap_1_Million.size());
    }

    public static void TreeMap_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            TreeMap_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeMap_1_Million.size());
    }

    public static void LinkedHashMap_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedHashMap_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashMap_1_Million.size());
    }

    public static void HashMap_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            HashMap_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("HashMap delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + HashMap_10_Million.size());
    }

    public static void TreeMap_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            TreeMap_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("TreeMap delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + TreeMap_10_Million.size());
    }

    public static void LinkedHashMap_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedHashMap_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedHashMap delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedHashMap_10_Million.size());
    }

}
