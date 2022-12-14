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

        LinkedList<Integer>list2=new LinkedList<>();
        list2.add(56);
        list2.add(70);
        list2.searchAndInsert(56,30);
        list2.show();
        list2.popFirst();
        list2.show();
        list2.popLast();
        list2.show();

        LinkedList<Integer>list3=new LinkedList<>();
        list3.add(56);
        list3.add(30);
        list3.add(70);
        list3.show();
        list3.searchAndInsert(30,40);
        list3.show();

    }
}
