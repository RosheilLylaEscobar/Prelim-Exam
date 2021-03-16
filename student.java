package escobar_PrelimExam;

public class student {

	private int IDN, CHours, GPoint;
	private double gpa;
	
	public student() {
	   }
	
	   public student(int ID, int Hours, int Point) {
		   super();
	       IDN = ID;
	       CHours = Hours;
	       GPoint = Point;
	       calculateGradePoint();
	       
	   }

	   public int getIDN() {
	       return IDN;
	   }

	   public void setIDN(int ID) {
	       IDN = ID;
	   }

	   public int getCHours() {
	       return CHours;
	   }

	   public void CHours(int Hours) {
	       CHours = Hours;
	   }

	   public int getGPoints() {
	       return GPoint;
	   }

	   public void setGPoints(int Point) {
	       GPoint = Point;
	   }
	   
	   @Override
	   public String toString() {
	       return "ID : " + IDN + " NumberOfCredits : " + CHours + " Points : " + GPoint + " Grade Point : "
	               + gpa;
	   }


	   public void calculateGradePoint() {
	       gpa = GPoint / (double) CHours;
	   }
}

