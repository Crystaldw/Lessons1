package lesson11.task1;

import lesson10.taask1.Cat;

import java.io.Serializable;

public class Test extends Cat implements Runnable, Serializable, Comparable {

    private String value;

    public Test(){

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
