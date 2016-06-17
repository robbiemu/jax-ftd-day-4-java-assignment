package com.cooksys.butterpillar.model;

public class Butterpillar {
	
	// any instance fields should be private
	private double length;
	private double leavesEaten;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLeavesEaten() {
		return leavesEaten;
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
	}
	
	public boolean equals(Butterpillar b) {
		if (b.length != length){
			return false;
		}
		if (b.leavesEaten != leavesEaten){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Butterpillar [length=" + length + ", leavesEaten=" + leavesEaten + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}
	
	

}
