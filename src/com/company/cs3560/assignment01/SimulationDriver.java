package com.company.cs3560.assignment01;


import java.util.Random;
import java.util.UUID;

public class SimulationDriver {

    public static void main(String[] args) {
	// write your code here
        //making a student object and putting them into a list

        int questionType;
        Random rand = new Random();
        //decide what question type it is going to be
        // 0 -> multiple choice
        // 1 -> Right or Wrong
        questionType = rand.nextInt(2);
        System.out.println("the question type is " +questionType );

        //answer types
        String[] mutipleChoice = {"A", "B", "C","D"};
        String[] twoChoice = {"1. Right", "2. Wrong"};


        //create student objects, assign ID and generate random answers
        Student[] studentArray = new Student[(rand.nextInt(21)+5)];
        System.out.println("size of studentArray " + studentArray.length);
        //fill student objects
        for (int i = 0; i<studentArray.length; i++) {
            String randUUID = UUID.randomUUID().toString();
            System.out.println("random ID "+ randUUID);

            if (questionType == 0){
                studentArray[i] = new Student(randUUID,mutipleChoice[rand.nextInt(4)] );
            }else{
                studentArray[i] = new Student(randUUID,twoChoice[rand.nextInt(1)] );

            }

            System.out.println("Student new ID: "+ studentArray[i].getStudentID());
            System.out.println("Answer chosen: "+ studentArray[i].getAnswer());
        }







    }
}
