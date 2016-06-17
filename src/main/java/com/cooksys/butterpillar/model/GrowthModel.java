package com.cooksys.butterpillar.model;

public class GrowthModel {

	// any instance fields should be private
	private double lengthToWingspan;
	private double leavesEatenToWeight;

	public double getLengthToWingspan() {
		return lengthToWingspan;
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight;
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;
	}

	public Catterfly butterpillarToCatterfly(Butterpillar b) {
		Catterfly c = new Catterfly();
		c.setWeight(b.getLeavesEaten()*leavesEatenToWeight);
		c.setWingspan(b.getLength()*lengthToWingspan);
		return c;
	}

	public Butterpillar catterflyToButterpillar(Catterfly c) {
		Butterpillar b = new Butterpillar();
		b.setLeavesEaten(c.getWeight()/leavesEatenToWeight);
		b.setLength(c.getWingspan()/lengthToWingspan);
		return b;
	}
	
	public boolean equals(GrowthModel g) {
		if(leavesEatenToWeight != g.getLeavesEatenToWeight()){
			return false;
		}
		if(lengthToWingspan != g.getLengthToWingspan()){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "GrowthModel [lengthToWingspan=" + lengthToWingspan + ", leavesEatenToWeight=" + leavesEatenToWeight
				+ "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
