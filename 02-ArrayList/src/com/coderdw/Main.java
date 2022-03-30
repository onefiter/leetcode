package com.coderdw;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        list.add(11);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
