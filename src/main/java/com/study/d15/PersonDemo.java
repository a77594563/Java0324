package com.study.d15;

import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Mary", 20);
        Person p3 = new Person("Helen", 40);
        
        Stream.of(p1, p2, p3).sorted().forEach(System.out::println);
        
        Stream.of(p1, p2, p3)
                .sorted( Comparator.comparing(Person::getAge).reversed() )
                .forEach(System.out::println);
        
        Stream.of(p1, p2, p3)
                .sorted(new Comparator<Person>(){
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                })
                .forEach(System.out::println);;
            List<Person> list = Stream.of(p1, p2, p3)
                .sorted( Comparator.comparing(Person::getAge))
                .collect(toList());

            System.out.println("list: " + list);
    }
}
