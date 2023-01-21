package com.techreturners.exercise005;
public class Exercise005
{

    static int size = 26;
    static boolean isLetter(char ch)
    {
        if (!Character.isLetter(ch))
            return false;

        return true;
    }
    public boolean isPangram(String input)
    {
        // Convert the given string
        // into lowercase

        if (input.isEmpty() ) {
            return false;
        }else{
        input = input.toLowerCase();

        // Create a frequency array to
        // mark the present letters
        boolean[] present = new boolean[size];

        // Traverse for each character
        // of the string
        for (int i = 0; i < input.length(); i++) {

            // If the current character
            // is a letter
            if (isLetter(input.charAt(i))) {

                // Mark current letter as present
                int letter = input.charAt(i) - 'a';
                present[letter] = true;
            }
        }

        // Traverse for every letter
        // from a to z
        for (int i = 0; i < size; i++) {

            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
                return false;
        }
        return true;
    }
    }
}
