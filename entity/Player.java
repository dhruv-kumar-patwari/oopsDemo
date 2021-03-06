package com.zemoso.entity;

public abstract class Player {
    protected CanPlayAs role;
    private double salary;

    public Player(CanPlayAs role) {
        this.role = role;
    }

    public void play(){
        System.out.println("Playing a Sport!!");
    }

    public void updateSalaryTo(double newYearlySalary){
        this.salary = newYearlySalary;
        System.out.println(printSalaryInfo(newYearlySalary, 12));
    }

    public void updateSalaryTo(double monthlySalary, int numberOfMonths){
        this.salary = calculateNewSalary(monthlySalary, numberOfMonths);
        System.out.println(printSalaryInfo(this.salary, numberOfMonths));
    }

    public abstract void playAs();
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double calculateNewSalary(double monthlySalary, int numberOfMonths) {
        return monthlySalary * numberOfMonths;
    }

    private String printSalaryInfo(double monthlySalary, int numberOfMonths) {
        return "Player earns $" + monthlySalary + " Million for " + numberOfMonths + " months.";
    }
}
