package com.company;

import java.util.Collection;

public class Person<T extends String,K extends Number> implements Comparable<Person<String,Integer>> {


    private T name;
    private K age;

    public T getName() {
        return name;
    }

    public K getAge() {
        return age;
    }

    public Person(T name, K age) {
        this.name = name;
        this.age = age;
    }

    public Person(K age) {
        this.age = age;
    }

    public Person(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person<String, Integer> o) {
        return 0;
    }
}
