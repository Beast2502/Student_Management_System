package com.company;

/**
 * This class is responsible for keeping the track of
 * teachers name , id , salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryRecieved;
    /**
     *Create new teacher object
     * @param id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id,String name , int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    // return id of the teacher
    public int getId(){
        return this.id;
    }

    // return name of the teacher
    public String getName(){
        return this.name;
    }

    //return the salary of the teacher
    public int getSalary(){
        return this.salary;
    }

    public void getSalary(int salaryRec){
        this.salaryRecieved= salaryRec;
        School.setTotalMoneySpent(salaryRec);
    }


}
