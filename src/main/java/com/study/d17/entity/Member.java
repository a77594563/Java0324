package com.study.d17.entity;

import java.util.Date;

public class Member {
    private String username;
    private String password;
    private int salary;
    private boolean active;
    private Date expired;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Member{" + "username=" + username + ", password=" + password + ", salary=" + salary + ", active=" + active + ", expired=" + expired + '}';
    }
    
}
