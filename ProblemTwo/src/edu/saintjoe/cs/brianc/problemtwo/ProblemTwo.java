package edu.saintjoe.cs.brianc.problemtwo;

public class ProblemTwo {
	int first;
	int second;
	int eleventh;
	String one = "Here we go!!";
	String two;
	String eleven;
	
	public int getFirst() {
		return first;
	}
	
	public void setFirst(int newValue) {
		first = newValue;
	}
	
	public String gettwo() {
		return two;
	}
	public void setEleventh(int newValue) {
		eleven = newValue;
		
	}
	public static void main(String[] args) {
		// Create a new ProblemTwo object, reference it with myProblem
		ProblemTwo myProblem = new ProblemTwo();
		
		// Assign something to the data member named "two"
		myProblem.two = "This is the best part; the part I really like";
		
		// Prove that it worked by printing the value back out
		System.out.println("We have '" + myProblem.gettwo() + "' for variable two");

	}

}
