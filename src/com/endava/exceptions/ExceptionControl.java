package com.endava.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionControl {

    public int customArrayIndexOutOfBoundsException(int[] arr, int arrLong) throws ThreeExceptions {
        try {
            return arr[arrLong];
        } catch (ArrayIndexOutOfBoundsException e){
            throw new ThreeExceptions(e);
        }
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

    public void customClassCastException(Object obj) throws ThreeExceptions {
        Object cast = obj;
        try {
            obj = (String)cast;
        } catch (ClassCastException e){
            throw new ThreeExceptions(e);
        }
    }
}
