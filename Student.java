//take a input from user and print student details as per below

import java.util.Scanner;
class Student
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter student id:");
        int id = sc.nextInt();
        System.out.println("Enter student roll:");
        int roll = sc.nextInt();
        System.out.println("Enter student phoneNo :");
        long phoneNo= sc.nextLong();
        System.out.println("Enter studentName:");
        String name= sc.next();
        System.out.println("Enter studentGender:");
        char Gender= sc.next().charAt(0);
        System.out.println("Enter student marks1:");
        double marks1= sc.nextDouble();
        System.out.println("Enter student marks2:");
        double marks2= sc.nextDouble();
        System.out.println("Enter student marks3:");
        double marks3= sc.nextDouble();

        double averageMarks = (marks1 + marks2 +marks3)/3;

        System.out.println("Enter studentAddress");
        String address = sc.next();

        System.out.println("Student name is :" +id);
        System.out.println("Student rollnumber is :" +roll);
        System.out.println("Student phoneno is :" +phoneNo);
        System.out.println("Student name is :" +name);
        System.out.println("Student gender is :" +Gender);
        System.out.println("Student marks1 is :" +marks1);
        System.out.println("Student marks2 is :" +marks2);
        System.out.println("Student marks3 is :" +marks3);
        System.out.println("Student averagemarks is :" +averageMarks);
        System.out.println("Student address is :" +address);
      

    }
}