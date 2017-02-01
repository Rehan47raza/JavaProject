package com;

import java.util.List;

public class City {
	private int cityId;
	private String cityName;
	private double cityPinCode;
	private double cityCharge;
	private List<Car> carListInCity;
	
	
	
	public City(int cityId, String cityName, double cityPinCode,
			double cityCharge) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityPinCode = cityPinCode;
		this.cityCharge = cityCharge;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getCityPinCode() {
		return cityPinCode;
	}
	public void setCityPinCode(double cityPinCode) {
		this.cityPinCode = cityPinCode;
	}
	public double getCityCharge() {
		return cityCharge;
	}
	public void setCityCharge(double cityCharge) {
		this.cityCharge = cityCharge;
	}
	public List<Car> getCarListInCity() {
		return carListInCity;
	}
	public void setCarListInCity(List<Car> carListInCity) {
		this.carListInCity = carListInCity;
	}
}
