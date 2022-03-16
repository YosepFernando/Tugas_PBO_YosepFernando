package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Denpasar");
        set.add("Karangasem");
        set.add("Klungkung");
        set.add("Ubud");

        System.out.println(set);

        set.remove("Ubud");

        System.out.println(set);

    }
}
