package com.bilgee.demo;

import com.bilgee.demo.model.Student;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       // New Branch ----> Main Class
        Scanner Scan = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        Scan.nextLine();


        /*TODO
            Instantiera objekterna
         */

        Student ann = new Student("Ann", 18);
        Student benny = new Student("Benny", 22);
        Student kalle = new Student("Kalle", 26);
        Student david = new Student("David", 33);
        Student erik = new Student("Erik", 31); // Alla 5 studenter med namn och ålder.

        /* TODO
            Skapar  arrayer för att lagra alla studenternas info.
         */
        Student[] students = new Student[5];
        String[] allNames = {"Ann", "Benny", "Kalle", "David", "Erik"};
        Random randomAge = new Random();

        /*TODO
            Skapar for loop.
         */
        for (int i = 0; i < 5; i++){
            int randomAgeValue = randomAge.nextInt(6,100);

            /* TODO
                Skriver ut info om alla studenter
        */
            students[i] = new Student(allNames[i], randomAgeValue );
            System.out.println(students[i].name + " " + students[i].age);
        }


        /*TODO
            Skriver ut doubleMyAge metoden.
         */
        System.out.println(benny.bonusDoubleMyAge());



    }

}