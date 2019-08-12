package day14;

public abstract class Shape {
	private static int numSides;
	
	
	Shape(int numSides){
		super();
		this.numSides = numSides;
	};
	
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	abstract double getArea();
}
