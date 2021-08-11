package com.company;

// this class is responsible for keep the track of students
// tract of student fees , name , grade and fees ;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor => to create new student by initializing .
     * fees for every student is $30000
     * fees paid initially is 0
     * @param id for the student : unique
     * @param name of the student
     * @param grade grade of the student
     */

    public Student(int id , String name , int grade ){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
  //not going to alter student's name , students id

    /**
     *
     * @param grade is the new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
  }

    /**
     * Add the fees to the fees paid
     * keep adding the fees to fees paid field
     * The school is going to recieve the funds
     * @param fees is the fees that the student pays
     */
  public void updateFeesPaid(int fees){

      this.feesPaid= this.feesPaid + fees;
      School.setTotalMoneyEarned(fees);
  }


  public int getStuid(){
        return this.id;
    }
  public String getStuName(){
      return this.name;
  }

  public int getStuGrade(){
      return this.grade;
  }

  public int getStuFeesPaid(){
      return this.feesPaid;
  }



  public int getStuTotalFees(){
      return this.feesTotal;
  }



}
