package edu.ucalgary.oop;

public class TwoClass {
	private int value;

	public TwoClass(int number) {
		this.value = number;
	}

	public void output() {
		System.out.println("TwoClass was instantiated with " +
		value);
	}

	public static void main(String[] args){
		System.out.println("works");
	}
}