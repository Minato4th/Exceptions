package com.endava.service;

import com.endava.exceptions.ExceptionControl;
import com.endava.exceptions.ThreeExceptions;
import com.endava.util.Validator;

import java.util.*;

public class Menu {

    private ExceptionControl except;
    private int choice;
    private Validator validator;
    private Map<Integer, Throwable> map;
    private List<Integer> list;

    public Menu() {
        this.validator = new Validator();
        this.except = new ExceptionControl();
        this.map = new HashMap<>();

        this.map.put(1, new ThreeExceptions());
        this.map.put(2, new NullPointerException());
        this.map.put(3, new NoSuchMethodException());

        this.list = new ArrayList<>();
    }

    public void mainMenu() {

        for (int i = 0; i < 3; i++) {
            System.out.println(Text.START_MENU.getText());
            choice = validator.isDigit();

            if (choice == Numbers.ONE.getNumber()) {
                excIndex();
                i = 0;
            } else if (choice == Numbers.TWO.getNumber()) {
                excFile();
                i = 0;
            } else if (choice == Numbers.THREE.getNumber()) {
                exceptionsCast();
                i = 0;
            } else if (choice == Numbers.FOUR.getNumber()) {
                randomException();
                i = 0;
            } else if (choice == Numbers.FIVE.getNumber()) {
                System.out.println(recursiveMethod(generateList(), 0));
                System.out.println(Text.DONE_INFO.getText());
                i = 0;
            } else if (choice == Numbers.SIX.getNumber()) {
                i = 5;
            } else if (choice > Numbers.SIX.getNumber()){
                System.out.println(Text.WRONG_COMMAND.getText());
            }
        }
        System.out.println(Text.END_PROGRAM.getText());
    }

    private void excIndex() {
        System.out.println(Text.INDEX_INFO.getText());

        try {
            choice = except.customArrayIndexOutOfBoundsException(new int[validator.isDigit()], validator.isDigit());
            System.out.println(Text.DONE_INFO.getText());
        } catch (ThreeExceptions e) {
            e.validateException();
            System.err.println(e.getMessage());
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void excFile() {
        System.out.println(Text.FILE_INFO.getText());
        try {
            except.customFileNotFoundException(validator.isString());
            System.out.println(Text.DONE_INFO.getText());
        } catch (ThreeExceptions e) {
            e.validateException();
            System.err.println(e.getMessage());
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void exceptionsCast() {
        System.out.println(Text.CAST_INFO.getText());
        Object obj = new Object();

        choice = validator.isDigit();

        if (choice == Numbers.ONE.getNumber()) {
            obj = new Integer(5);
        } else if (choice == Numbers.TWO.getNumber()) {
            obj = new String("Hello");
        } else if (choice == Numbers.THREE.getNumber()) {
            obj = new Boolean(true);
        }

        try {
            except.customClassCastException(obj);
            System.out.println(Text.DONE_INFO.getText());
        } catch (ThreeExceptions e) {
            e.validateException();
            System.err.println(e.getMessage());
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void randomException() {
        Random random = new Random();

        try {
            throw map.get(random.nextInt(4)+1);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<Integer> generateList(){
        for (int i = 0; i < new Random().nextInt(15); i++) {
            list.add(i);
        }
        return list;
    }

    private int recursiveMethod(List list, int length){
        assert length < 8 : "List is longer that 8";
        if (length < list.size()){
            length++;
            length = recursiveMethod(list, length);
        }
        return length;
    }
}
