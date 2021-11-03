package com.company;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        Function<Integer, Person<String, Integer>> function = Person::new;
        Supplier<Person<String, Integer>> supplier = () -> createPerson(function, 20);
        System.out.println(supplier.get());


        Predicate<String> predicate = String::isEmpty;
        List<String> stringList = new ArrayList<>(List.of("Kirill", "Oleg", "", "Key", ""));
        System.out.println(stringList.removeIf(predicate));
        System.out.println(stringList);

        Supplier<Person<String, Integer>> supplier1 = () -> new Person<>("Kirill", 20);
        System.out.println(supplier1.get());


        List<Integer> integerList = new ArrayList<>(List.of(6, 8, 1, 7, 0, 3, 4));
        List<Integer> integerList1 = new ArrayList<>();
        Consumer<Integer> consumer = integerList1::add;
        System.out.println("Лист 1:" + integerList);
        integerList.forEach(consumer);
        System.out.println("Лист 2:" + integerList1);


        List<Integer> integerList3 = new ArrayList<>();
        integerList3.add(5);
        integerList3.add(-1);
        integerList3.add(23);
        integerList3.add(null);
        integerList.add(56);

        Optional<Integer> optional = Optional.of(integerList3.get(3));
        System.out.println(optional);

        Integer x =null;
        Optional<Integer> optionalInteger = Optional.ofNullable(x);
        System.out.println(optionalInteger);



    }

    public static <T, R> R createPerson(Function<T, R> function, T value) {
        return function.apply(value);
    }


}
