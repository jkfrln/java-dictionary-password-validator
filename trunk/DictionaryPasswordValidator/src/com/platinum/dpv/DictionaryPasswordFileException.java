package com.platinum.dpv;

/**
 * DictionaryPasswordFileException -- An exception occurred while trying
 * to read the dictionary files in the lib.
 *
 * License: Apache 2.0
 *
 * @author jlucier
 *
 */
public class DictionaryPasswordFileException extends Exception {

    public DictionaryPasswordFileException(Exception e) {
        super(e);
    }

    public DictionaryPasswordFileException(String message, Exception ex) {
        super(message, ex);
    }
}
