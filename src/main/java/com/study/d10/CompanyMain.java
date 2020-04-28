package com.study.d10;

public class CompanyMain {
    public static void main(String[] args) {
        Department dept = new Department();
        dept.setName("資訊部門");
        // 該部門員工的工作是
        Department.Employee emp = dept.new Employee();
        System.out.print(dept.getName() + " 的工作是 ");
        emp.job();
    }
}
