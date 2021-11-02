package com.company;

public class Person<T extends String,K extends Number> {


    private T name;
    private K age;

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
}
