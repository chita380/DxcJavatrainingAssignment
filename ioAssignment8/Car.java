package io;

import java.io.Serializable;

public class Car implements Serializable {

	private transient String  registrationNo ; 
	private String carMake;
	private Engine engine;
	@Override
	public String toString() {
		return "Car [registrationNo=" + registrationNo + ", carMake=" + carMake
				+ ", engine=" + engine + "]";
	}
	public Car(String registrationNo, String carMake, Engine engine) {
		super();
		this.registrationNo = registrationNo;
		this.carMake = carMake;
		this.engine = engine;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
