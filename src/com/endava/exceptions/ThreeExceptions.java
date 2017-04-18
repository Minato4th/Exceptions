package com.endava.exceptions;

import com.endava.service.Text;

import java.io.FileNotFoundException;

public class ThreeExceptions extends Throwable{
    private Object object;

    public ThreeExceptions() {
    }

    public ThreeExceptions(Object object) {
        this.object=object;
    }

    public void validateException(){
        if(object instanceof  ArrayIndexOutOfBoundsException){
            System.err.println(Text.ARRAY_EXCEPTION.getText());
        }else  if (object instanceof FileNotFoundException){
            System.err.println(Text.FILE_EXCEPTION.getText());
        }else if (object instanceof ClassCastException){
            System.err.println(Text.CLASS_EXCEPTION.getText());
        }
    }

    @Override
    public String getMessage() {
        if(object instanceof  ArrayIndexOutOfBoundsException){
            return  Text.ARRAY_ERROR.getText();
        }else  if (object instanceof FileNotFoundException){
            return Text.FILE_ERROR.getText();
        }else if (object instanceof ClassCastException){
            return Text.CLASS_ERROR.getText();
        }
        return Text.NO_ERROR.getText();
    }
}
