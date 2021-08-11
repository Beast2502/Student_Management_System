package com.company;
import java.util.List;


/**
 * Many teachers , many students
 * Implement teachers and students using an arraylist
 */
// List<int> numbers = new ArrayList<>()
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers , List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned= 0;
        totalMoneySpent = 0;

    }

    public List<Teacher> getTeachers(){
        return this.teachers;
    }
// add the teacher in the school
    public  void addTeacher(Teacher teachers){
      this.teachers.add(teachers);
    }
// return list of students in the school
    public List<Student> getStudents(){
        return this.students;
    }
//add the student in the school;
    public void setStudents (Student students){
    this.students.add(students);
    }

    public int getTotalMoneyEarned(){
        return this.totalMoneyEarned;
    }

    public static void setTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }
    public int getTotalMoneySpent(){
        return this.totalMoneySpent;
    }
// salary given to the teachers is the money spent
    public void setTotalMoneySpent(int moneySpent){
        this.totalMoneyEarned -= moneySpent;
    }

}

