package com.study.d10;

// 部門定義
public class Department {
    static int workTime = 8; // 工作時數
    int add = 20000; // 部門加給
    // 員工定義
    class Employee{
        public void job(){
            int salary = 40000; // 本薪
            System.out.println("寫程式");
        }
    }
    // 部門名稱
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
