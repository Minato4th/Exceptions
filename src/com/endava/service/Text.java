package com.endava.service;

/**
 * 4/18/2017
 */
public enum  Text {
    START_MENU("Hello select one of \n" +
            "1. Generate ArrayIndexOutOfBoundsException \n" +
            "2. Generate FileNotFoundException \n" +
            "3. Generate ClassCastException \n" +
            "4. Generate random exception from the HashMap \n" +
            "5. Start Recursive Method, with random size \n" +
            "6. Exit \n"),
    INDEX_INFO("Set length of array and then required position on it:"),
    FILE_INFO("Set file position, (correct dir: src/text.txt)"),
    CAST_INFO("Set in what to cast: \n" +
            "1. Integer \n" +
            "2. String \n" +
            "3. Boolean \n"),
    END_PROGRAM("The end :)"),
    DONE_INFO("Everything is done well"),
    EMPTY_COMMAND("Empty command"),
    WRONG_STRING("Wrong in String format, try again"),
    WRONG_NUMBER("Wrong number format, please try again"),
    WRONG_COMMAND("Wrong command number, please try again"),
    ARRAY_EXCEPTION("Index Out of Bound, Please try again"),
    FILE_EXCEPTION("File not found try again"),
    CLASS_EXCEPTION("Unexpected Class"),
    ARRAY_ERROR("Array Error"),
    FILE_ERROR("File Error"),
    CLASS_ERROR("Class Error"),
    NO_ERROR("No Such Error");


    private final String text;

    Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
