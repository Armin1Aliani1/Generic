package com.generic;

import java.util.ArrayList;

public class Generic2Two {
    public static void main(String[] args) {
        ArrayList arrayListOne = new ArrayList();
        // Type safety
        arrayListOne.add(12);
        arrayListOne.add(10);
        arrayListOne.add(2);
        arrayListOne.add("Armin");

        for (int i = 0; i < arrayListOne.size(); i++) {
            // instanceof : If type (arrayListOne.get(i)) is type Integer , go into condition if
            if (arrayListOne.get(i) instanceof Integer) {
                System.out.println((int) arrayListOne.get(i) * 2);
            }
            // instanceof : If type (arrayListOne.get(i)) is type Integer , go into condition if
        }
    }
}
