package io;

import java.io.Serializable;

public class Engine implements Serializable {

	

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", cubicCapicity="
				+ cubicCapicity + "]";
	}
	private  transient String engineNo; 
	private int cubicCapicity;
	public Engine(String engineNo, int cubicCapicity) {
		super();
		this.engineNo = engineNo;
		this.cubicCapicity = cubicCapicity;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public int getCubicCapicity() {
		return cubicCapicity;
	}
	public void setCubicCapicity(int cubicCapicity) {
		this.cubicCapicity = cubicCapicity;
	}
	
}
