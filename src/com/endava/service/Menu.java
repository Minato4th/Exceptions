package com.endava.service;

import com.endava.exceptions.ExceptionControl;
import com.endava.exceptions.ThreeExceptions;
import com.endava.util.Validator;

import java.util.*;

public class Menu {

    private ExceptionControl except;
    private int choice;
    private int length;
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
            Text.start();
            choice = validator.isDigit();

            if (choice == Text.ONE) {
                excIndex();
                i = 0;
            } else if (choice == Text.TWO) {
                excFile();
                i = 0;
            } else if (choice == Text.THREE) {
                exceptionsCast();
                i = 0;
            } else if (choice == Text.FOUR) {
                randomException();
                i = 0;
            } else if (choice == Text.FIVE) {
                length = 0;
                System.out.println(recurseMethod(generateList(), length));
                i = 0;
            } else if (choice == Text.FIVE) {
                i = 5;
            }

        }

        Text.end();

    }

    private void excIndex() {
        Text.setIndex();

        try {
            choice = except.customArrayIndexOutOfBoundsException(validator.isDigit(), new int[validator.isDigit()]);
            Text.done();
        } catch (ThreeExceptions e) {
            e.validateExcp();
            System.err.println(e.getMessage());
        }

    }

    private void excFile() {
        Text.setFile();
        try {
            except.customFileNotFoundException(validator.isString());
            Text.done();
        } catch (ThreeExceptions e) {
            e.validateExcp();
            System.err.println(e.getMessage());
        }

    }

    private void exceptionsCast() {
        Text.setCast();
        Object obj = new Object();

        choice = validator.isDigit();

        if (choice == Text.ONE) {
            obj = new Integer(5);
        } else if (choice == Text.TWO) {
            obj = new String("Hello");
        } else if (choice == Text.THREE) {
            obj = new Boolean(true);
        }

        try {

            except.customcClassCastException(obj);
            Text.done();
        } catch (ThreeExceptions e) {
            e.validateExcp();
            System.err.println(e.getMessage());
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
            Thread.sleep(100);
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

    private int recurseMethod(List list, int length){

        assert length < 8 : "List is longer that 8";
        if (length < list.size()){
            length++;
            length = recurseMethod(list, length);
        }

        return length;
    }

}
