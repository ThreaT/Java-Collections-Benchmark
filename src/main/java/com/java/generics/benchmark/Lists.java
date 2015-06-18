package com.java.generics.benchmark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Lists {

    private static ArrayList<Integer> ArrayList_1_Million = new ArrayList<>();
    private static Stack<Integer> Stack_1_Million = new Stack<>();
    private static LinkedList<Integer> LinkedList_1_Million = new LinkedList<>();
    private static ArrayList<Integer> ArrayList_10_Million = new ArrayList<>();
    private static Stack<Integer> Stack_10_Million = new Stack<>();
    private static LinkedList<Integer> LinkedList_10_Million = new LinkedList<>();

    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        ArrayList_Create_1_Million();
        Stack_Create_1_Million();
        LinkedList_Create_1_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Create_10_Million();
        Stack_Create_10_Million();
        LinkedList_Create_10_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Read_1_Million();
        Stack_Read_1_Million();
        LinkedList_Read_1_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Read_10_Million();
        Stack_Read_10_Million();
        LinkedList_Read_10_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Update_1_Million();
        Stack_Update_1_Million();
        LinkedList_Update_1_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Update_10_Million();
        Stack_Update_10_Million();
        LinkedList_Update_10_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Delete_1_Million();
        Stack_Delete_1_Million();
        LinkedList_Delete_1_Million();
        System.out.println("-------------------------------------------------");
        ArrayList_Delete_10_Million();
        Stack_Delete_10_Million();
        LinkedList_Delete_10_Million();
    }

    public static void ArrayList_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            ArrayList_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayList_1_Million.size());
    }

    public static void Stack_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Stack_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + Stack_1_Million.size());
    }

    public static void LinkedList_Create_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LinkedList_1_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList create 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedList_1_Million.size());
    }

    public static void ArrayList_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            ArrayList_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayList_10_Million.size());
    }

    public static void Stack_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Stack_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + Stack_10_Million.size());
    }

    public static void LinkedList_Create_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            LinkedList_10_Million.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList create 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedList_10_Million.size());
    }

    public static void ArrayList_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = ArrayList_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void Stack_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = Stack_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedList_Read_1_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedList_1_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList read 1 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void ArrayList_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = ArrayList_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void Stack_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = Stack_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void LinkedList_Read_10_Million() {
        Long startTime = System.currentTimeMillis();
        Integer lastValue = 0;
        Iterator iterator = LinkedList_10_Million.iterator();
        while (iterator.hasNext()) {
            lastValue = (Integer) iterator.next();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList read 10 million execution time: " + (endTime - startTime) + "ms. Last value: \"" + lastValue + "\"");
    }

    public static void ArrayList_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = ArrayList_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newArrayList.add(updatedValue);
            updatedValue++;
        }
        ArrayList_1_Million = newArrayList;
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void Stack_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        Stack<Integer> newStack = new Stack<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = Stack_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newStack.add(updatedValue);
            updatedValue++;
        }
        Stack_1_Million = newStack;
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedList_Update_1_Million() {
        Long startTime = System.currentTimeMillis();
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedList_1_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedList.add(updatedValue);
            updatedValue++;
        }
        LinkedList_1_Million = newLinkedList;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList update 1 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void ArrayList_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = ArrayList_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newArrayList.add(updatedValue);
            updatedValue++;
        }
        ArrayList_10_Million = newArrayList;
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void Stack_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        Stack<Integer> newStack = new Stack<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = Stack_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newStack.add(updatedValue);
            updatedValue++;
        }
        Stack_10_Million = newStack;
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void LinkedList_Update_10_Million() {
        Long startTime = System.currentTimeMillis();
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        Integer updatedValue = 0;
        Iterator<Integer> iterator = LinkedList_10_Million.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            newLinkedList.add(updatedValue);
            updatedValue++;
        }
        LinkedList_10_Million = newLinkedList;
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList update 10 million execution time: " + (endTime - startTime) + "ms. Last updated value: \"" + updatedValue + "\"");
    }

    public static void ArrayList_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < ArrayList_1_Million.size(); i++) {
            ArrayList_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayList_1_Million.size());
    }

    public static void Stack_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < Stack_1_Million.size(); i++) {
            Stack_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + Stack_1_Million.size());
    }

    public static void LinkedList_Delete_1_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < LinkedList_1_Million.size(); i++) {
            LinkedList_1_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList delete 1 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedList_1_Million.size());
    }

    public static void ArrayList_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < ArrayList_10_Million.size(); i++) {
            ArrayList_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("ArrayList delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + ArrayList_10_Million.size());
    }

    public static void Stack_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < Stack_10_Million.size(); i++) {
            Stack_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Stack delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + Stack_10_Million.size());
    }

    public static void LinkedList_Delete_10_Million() {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < LinkedList_10_Million.size(); i++) {
            LinkedList_10_Million.remove(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("LinkedList delete 10 million execution time: " + (endTime - startTime) + "ms. Current size: " + LinkedList_10_Million.size());
    }

}
