package escobar_PrelimExam;

public class student {

	public int IDN, CHours, GPoint;
	

	   public student(int ID, int Hours, int Point) {
	       IDN = ID;
	       CHours = Hours;
	       GPoint = Point;
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
}

