package com.study.d10;

// 部門定義
public class Department {
    static int workTime = 8; // 工作時數
    int add = 20000; // 部門加給
    // 員工定義
    class Employee{
        int salary = 40000; // 本薪
        public void job(){
            System.out.println("寫程式");
        }
        public void printSalary(){ // 印出薪資單
            int salaryOfMonth = salary + Department.this.add ;
            System.out.printf("每日工作: %d 小時, 月薪: %d", Department.workTime, salaryOfMonth);
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
