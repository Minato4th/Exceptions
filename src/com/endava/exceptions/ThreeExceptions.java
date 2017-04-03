package com.endava.exceptions;

import java.io.FileNotFoundException;

public class ThreeExceptions extends Throwable{
    private Object object;

    public ThreeExceptions() {
    }

    public ThreeExceptions(Object object) {
        this.object=object;
    }

    public void validateExcp(){
        if(object instanceof  ArrayIndexOutOfBoundsException){
            System.err.println("Index Out of Bound, Please try again");
        }else  if (object instanceof FileNotFoundException){
            System.err.println("File not found try again");
        }else if (object instanceof ClassCastException){
            System.err.println("Unexpected Class");
        }
    }

    @Override
    public String getMessage() {
        String mesage = "";
        if(object instanceof  ArrayIndexOutOfBoundsException){
            mesage = "Array Error";
        }else  if (object instanceof FileNotFoundException){
            mesage = "File Error";
        }else if (object instanceof ClassCastException){
            mesage = "Class Error";
        }

        return mesage;
    }
}
