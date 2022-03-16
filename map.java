package com.company;
import java.util.*;

public class map {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("1091", "Yosep");
        map.put("1092", "Joko");
        map.put("1093", "Sinta");

        System.out.println(map);

        map.remove("1091");

        System.out.println(map);

    }
}
