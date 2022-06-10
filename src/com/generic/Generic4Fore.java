package com.generic;

import java.util.ArrayList;

public class Generic4Fore {
    public static void main(String[] args) {
        ArrayList<String> arrayListOne = new ArrayList();
        // ArrayList<String> is generic

        // Type safety
        arrayListOne.add("Armin");
        arrayListOne.add("Arian");
        arrayListOne.add("Reza");
//        arrayListTwo.add(10);

        String strOne = (String) arrayListOne.get(0);
        String strTwo = (String) arrayListOne.get(1);
        String strThree = (String) arrayListOne.get(2);
//        String strFore = (String) arrayListOne.get(3);

        System.out.println(strOne + "\t" + strTwo + "\t" + strThree);

    }
}
