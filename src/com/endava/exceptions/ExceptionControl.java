package com.endava.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionControl {

    public int customArrayIndexOutOfBoundsException(int arrLong, int[] arr) throws ThreeExceptions {
        int value = 0;
        try {
            value = arr[arrLong];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new ThreeExceptions(e);
        }

        return value;
    }

    public String customFileNotFoundException(String path) throws ThreeExceptions {
        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream file = new FileInputStream(path);
            int ch;
            while((ch = file.read()) != -1){
                builder.append((char)ch);
            }
        } catch (IOException e) {
            throw new ThreeExceptions(e);
        }

        return builder.toString();
    }

    public void customcClassCastException(Object obj) throws ThreeExceptions {
        Object cast = obj;
        try {
            obj = (String)cast;
        } catch (ClassCastException e){
            throw new ThreeExceptions(e);
        }
    }
}
