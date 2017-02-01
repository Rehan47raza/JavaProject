package com;

public class Car {
	private int carId;
	private String carCompanyName;
	private String carDriverName;
	private String mappedCity;
	private double charge;
	public Car(int carId, String carCompanyName, String carDriverName,
			String mappedCity, double charge) {
		super();
		this.carId = carId;
		this.carCompanyName = carCompanyName;
		this.carDriverName = carDriverName;
		this.mappedCity = mappedCity;
		this.charge = charge;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarCompanyName() {
		return carCompanyName;
	}
	public void setCarCompanyName(String carCompanyName) {
		this.carCompanyName = carCompanyName;
	}
	public String getCarDriverName() {
		return carDriverName;
	}
	public void setCarDriverName(String carDriverName) {
		this.carDriverName = carDriverName;
	}
	public String getMappedCity() {
		return mappedCity;
	}
	public void setMappedCity(String mappedCity) {
		this.mappedCity = mappedCity;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	
}
