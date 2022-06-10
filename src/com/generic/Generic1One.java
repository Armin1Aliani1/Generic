package com.generic;

import java.util.ArrayList;

public class Generic1One {
    public static void main(String[] args) {
        ArrayList arrayListOne = new ArrayList();
        arrayListOne.add("Armin");
        arrayListOne.add("Arian");
        arrayListOne.add("Reza");
        arrayListOne.add(26);

        for (int i = 0; i < arrayListOne.size(); i++) {
            System.out.println(arrayListOne.get(i));
        }
    }
}
