package com.endava.util;

import com.endava.service.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validator {

    private String string;
    private BufferedReader reader;

    public Validator(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String isString(){

        for (int i = 0; i < 3; i++) {
            try {
                this.string = reader.readLine();
                if (string.length() == 0){
                    System.out.println(Text.EMPTY_COMMAND.getText());
                } else {
                    i = 5;
                }
            } catch (IOException e) {
                System.out.println(Text.WRONG_STRING.getText());
            }
        }
        return string;
    }

    public int isDigit(){

        for (int j = 0; j < 3; j++) {
            boolean right = true;
            String numS = isString();
            for (int i = 0; i < numS.length(); i++) {
                if (!Character.isDigit(numS.charAt(i))){
                    System.out.println(Text.WRONG_NUMBER.getText());
                    right = false;
                    break;
                }
            }

            if (right) {
                j = 5;
                this.string = numS;
            }
        }
        return Integer.parseInt(this.string);
    }
}
