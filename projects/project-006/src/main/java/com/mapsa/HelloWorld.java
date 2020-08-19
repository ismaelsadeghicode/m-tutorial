package com.mapsa;

/**
 * @author Esmaeil Sadeghi, 7/31/20 11:13 AM
 */
public class HelloWorld {
    private String msg;
    private int age;

    public void getMsg() { // todo
        System.out.println("Hello " + msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
