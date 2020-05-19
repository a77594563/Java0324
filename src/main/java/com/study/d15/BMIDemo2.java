package com.study.d15;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class BMIDemo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d15\\data.csv");
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\a");
        String data = sc.next();
        String[] rows = data.split("\n");
        List<BMI> list = new ArrayList<>();
        
        for (String row : rows) {
            String[] rowArray = row.trim().split(",");
            String name = rowArray[0];
            double height = Double.parseDouble(rowArray[1]);
            double weight = Double.parseDouble(rowArray[2]);
            BMI bmi = new BMI(name, height, weight);
            list.add(bmi);
        }
        
        list.stream()
                .sorted()
                .forEach(System.out::println);
        
        list.stream()
                .sorted( Comparator.comparing(BMI::getBMI) )
                .forEach(System.out::println);
    }
}
