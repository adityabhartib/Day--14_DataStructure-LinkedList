package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("-----Welcome to DataStructure Program-----");
        LinkedList<Integer> list=new LinkedList();
        list.push(70);
        list.push(30);
        list.push(56);
        list.show();

        LinkedList<Integer>list1=new LinkedList<>();
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.show();

    }
}
