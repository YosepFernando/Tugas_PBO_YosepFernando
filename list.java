package com.company;
import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Pantai melasti");
        list.add("Pantai Pandawa");
        list.add("Pantai Kuta");

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }
}
