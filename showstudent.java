package escobar_PrelimExam;

import java.util.Scanner;
public class showstudent {
		
	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter Id");
	       int IDN = sc.nextInt();
	       System.out.println("Enter number of credits: ");
	       int cs = sc.nextInt();
	       System.out.println("Enter number of points: ");
	       int p = sc.nextInt();
	       student s = new student(IDN, cs, p);
	       System.out.println(s);
	   }
	}