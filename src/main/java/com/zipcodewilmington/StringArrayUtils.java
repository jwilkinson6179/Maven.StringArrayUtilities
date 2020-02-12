package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array)
    {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array)
    {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value)
    {
        for(String element : array)
        {
            if(element == value)
            {
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int lastIdx = array.length - 1;

        for(int i = lastIdx; i >= 0; i--)
        {
            reversedArray[lastIdx - i] = array[i];
        }

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array)
    {
        boolean palindromeSoFar = true;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != array[array.length - i - 1])
            {
                palindromeSoFar = false;
            }
        }
        return palindromeSoFar;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array)
    {
        String combinedStrings = Arrays.deepToString(array);
        combinedStrings.replaceAll(" ", "");
        combinedStrings = combinedStrings.toLowerCase();
        char[] arrayOfLettersOfStrings = combinedStrings.toCharArray();
        String uniqueChars = "";

        for(char letter : arrayOfLettersOfStrings)
        {
            int charUniValue = (int) letter;

            if( charUniValue >= 97 && charUniValue <= 122)
            {

                if(!uniqueChars.contains(String.valueOf(letter)))
                {
                    uniqueChars += letter;
                }
            }
        }

        if(uniqueChars.length() == 26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occuranceCount = 0;

        for(String element : array)
        {
            if(element == value)
            {
                occuranceCount++;
            }
        }
        return occuranceCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int newArraySize = 0;
        int newArrayInd = 0;

        for(String element : array)
        {
            if(valueToRemove != element)
            {
                newArraySize++;
            }
        }

        String[] arrayWithValueRemoved = new String[newArraySize];

        for(int i = 0; i < array.length; i++)
        {
            if(!array[i].equals(valueToRemove))
            {
                arrayWithValueRemoved[newArrayInd] = array[i];
                newArrayInd++;
            }
        }

        return arrayWithValueRemoved;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int newArraySize = 0;
        int newArrayInd = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(i == 0) {
                if (array[0] != array[1]) {
                    newArraySize++;
                }
            }
            else if(i == array.length - 1)
            {
                if(array[array.length - 1] != array[array.length - 2])
                {
                    newArraySize++;
                }
            }
            else
            {
                if(array[i - 1] != array[i] && array[i] != array[i + 1])
                {
                    newArraySize++;
                }
            }
        }

        String[] arrayWithoutDupes = new String[newArraySize];

        for(int i = 0; i < array.length; i++)
        {
            if(i == 0) {
                if (array[0] != array[1]) {
                    arrayWithoutDupes[newArrayInd] = array[0];
                    newArrayInd++;
                }
            }
            else if(i == array.length - 1)
            {
                if(array[array.length - 1] != array[array.length - 2])
                {
                    arrayWithoutDupes[newArrayInd] = array[i];
                    newArraySize++;
                }
            }
            else
            {
                if(array[i - 1] != array[i] && array[i] != array[i + 1])
                {
                    arrayWithoutDupes[newArrayInd] = array[i];
                    newArraySize++;
                }
            }
        }

        return arrayWithoutDupes;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
