package dev.petersarazin.find_unique_character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an arbitrary length input stream of characters,
 * return the first character that does not repeat anywhere in the stream.
 */
public class UniqueCharacter {

    public static void main(String[] args) {

        Character firstUniqueCharacter = null;
        firstUniqueCharacter = findFirstUniqueCharacter( "ABCFDCAB" );
        System.out.println( "firstUniqueCharacter:" + firstUniqueCharacter);
    }


    /**
     * find first unique character utility method
     * @param inputString a string of characters
     * @return first unique character if one exists
     */
    public static char findFirstUniqueCharacter(String inputString) {

        // validate input
        if( inputString == null ) {
            throw new IllegalArgumentException( "inputString is required");
        }

        if( inputString.isBlank() ) {
            throw new IllegalArgumentException( "inputString must not be blank." );
        }

        Character firstUniqueCharacter = null;
        char[] charArray = inputString.toCharArray();
        List<Character> sortedList = convertStringToSortedListOfCharacters( inputString );

        // for each character from the original ordered string
        for ( int i = 0; i < charArray.length; i++ ) {

            // look for first position of each character in sorted array
            int pos = sortedList.indexOf(charArray[i]);

            // if the first occurrence of this character in the last position of the sorted list, or if the character in
            // the next position of the list is not the same character, then this character is unique.
            if ( ( ( charArray.length - 1 ) == pos ) || !( sortedList.get(pos + 1) == charArray[i] ) ) {
                firstUniqueCharacter = charArray[i];
                break;
            }
        }

        if( firstUniqueCharacter == null )
        {
            throw new NoUniqueCharactersException( "No unique characters in inputString: " + inputString );
        }

        return firstUniqueCharacter;
    }

    private static List<Character> convertStringToSortedListOfCharacters( String inputString ) {
        char[] sortedArray = inputString.toCharArray();
        Arrays.sort( sortedArray );

        List<Character> sortedList = new ArrayList<Character>();

        for ( char c : sortedArray ) {
            sortedList.add(c);
        }

        return sortedList;
    }
}
