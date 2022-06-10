package com.generic;

import java.util.ArrayList;

public class Generic3Three {
    public static void main(String[] args) {
        ArrayList arrayListTwo = new ArrayList();
        // Type safety
        arrayListTwo.add("Armin");
        arrayListTwo.add("Arian");
        arrayListTwo.add("Reza");
        arrayListTwo.add(10);

        String strOne = (String) arrayListTwo.get(0);
        String strTwo = (String) arrayListTwo.get(1);
        String strThree = (String) arrayListTwo.get(2);
        String strFore = (String) arrayListTwo.get(3);

    }
}
