package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {
    public static int findIndex(String arr[], String t)
    {
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    int getIceCreamCode(String iceCreamFlavour) {

        String[] flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        int g = findIndex(flavours, iceCreamFlavour);

        if (g >=0 )
            return g;
        else
            throw new UnsupportedOperationException(("Ice cream flavour does not exist"));
    }

    String[] iceCreamFlavours(String[] ii ) {

        if (ii.length > 1)
            return ii;
        else
            throw new UnsupportedOperationException(("Please select more than one flavour"));
    }

}

