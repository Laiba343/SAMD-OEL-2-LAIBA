package com.example.mad_oel_final;

public class Employee {
    private int employeeNo;
    private String password;
    private String name;

    public Employee()
    {}

    public Employee(int employeeNo, String password, String name)
    {
        this.employeeNo     = employeeNo;
        this.password       = password;
        this.name           = name;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

