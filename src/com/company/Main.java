package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher lizzy = new Teacher(1,"lizzy",5000);
        Teacher jack = new Teacher(2,"Jack",500000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(jack);


        Student mehul = new Student(1,"Mehul Saxena",6);
        Student asmita = new Student(1,"Asmita Yadav",10);
        List<Student> studentList = new ArrayList<>();
        studentList.add(mehul);
        studentList.add(asmita);

        School psit = new School(teacherList,studentList);

        System.out.println("PSIT college earned " +psit.getTotalMoneyEarned());
        mehul.updateFeesPaid(5000);
        mehul.updateFeesPaid(5000);

        System.out.println("Mehul paid fees "+mehul.getStuFeesPaid());
        System.out.println("PSIT Earned "+ psit.getTotalMoneyEarned());

        // School paid salary to lizzy
        lizzy.getSalary(6000);
        System.out.println("PSIT spent "+psit.getTotalMoneySpent());
        System.out.println("PSIT Earned "+ psit.getTotalMoneyEarned());




    }
}
