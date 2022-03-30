package com.coderdw;

public class Main   {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(0, 55);
        list.add(2, 66);
        list.add(list.size(), 77);

        System.out.println(list);
    }
}
