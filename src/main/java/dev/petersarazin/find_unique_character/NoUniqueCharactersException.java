package dev.petersarazin.find_unique_character;

public class NoUniqueCharactersException extends RuntimeException {

    public NoUniqueCharactersException( String message ) {
        super( message );
    }
}
