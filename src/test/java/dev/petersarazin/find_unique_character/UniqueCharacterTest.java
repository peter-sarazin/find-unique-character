package dev.petersarazin.find_unique_character;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class UniqueCharacterTest {

    @Test
    void findFirstUniqueCharacterInABCFDCAB() {

        Character firstUniqueCharacter = null;
        firstUniqueCharacter = UniqueCharacter.findFirstUniqueCharacter( "ABCFDCAB" );
        Assertions.assertEquals('F', firstUniqueCharacter);
   }

    @Test
    void findFirstUniqueCharacterInXAABBCC() {

        Character firstUniqueCharacter = null;
        firstUniqueCharacter = UniqueCharacter.findFirstUniqueCharacter( "XAABBCC" );
        Assertions.assertEquals('X', firstUniqueCharacter);
    }
    @Test
    void findFirstUniqueCharacterInAABBCCX() {

        Character firstUniqueCharacter = null;
        firstUniqueCharacter = UniqueCharacter.findFirstUniqueCharacter( "AABBCCX" );
        Assertions.assertEquals('X', firstUniqueCharacter);
    }

    @Test
    void findFirstUniqueCharacterInStringWithNoUniqueCharacters() {

        Assertions.assertThrowsExactly( NoUniqueCharactersException.class, () -> UniqueCharacter.findFirstUniqueCharacter( "AABBCC" ) );
    }

    @Test
    void findFirstUniqueCharacterInBlankString() {

        Assertions.assertThrowsExactly( IllegalArgumentException.class, () -> UniqueCharacter.findFirstUniqueCharacter( "  " ) );
    }

    @Test
    void findFirstUniqueCharacterInEmptyString() {

        Assertions.assertThrowsExactly( IllegalArgumentException.class, () -> UniqueCharacter.findFirstUniqueCharacter( "" ) );
    }

    @Test
    void findFirstUniqueCharacterInNullString() {

        Assertions.assertThrowsExactly( IllegalArgumentException.class, () -> UniqueCharacter.findFirstUniqueCharacter( null ) );
    }

}