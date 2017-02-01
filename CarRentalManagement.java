package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CarRentalManagement implements CarRentalMgmtInf{
	private List<City> cityList=new ArrayList<City>();

	@Override
	public int addCar(Car car)throws CarAlreadyExistsException {
		// TODO Auto-generated method stub
		boolean flag= true;
		try{
		for(City city : cityList){
			if(city.getCityName()==car.getMappedCity()){
				for(Car c : city.getCarListInCity()){
					if(c.getCarId()==car.getCarId())
						flag = false;
				}
				if(flag){
					city.getCarListInCity().add(car);
					return city.getCarListInCity().size();}
				else
					throw new CarAlreadyExistsException();
				
				
			}
		}
		}
		catch(NullPointerException ex){
			System.out.println("Exception");
		}
		return -1;
	}

	@Override
	public int addCity(City city) throws CityAlreadyExistsException{
		// TODO Auto-generated method stub
		boolean flag = true;
		for(City cl : cityList){
			if(cl.getCityPinCode()==city.getCityPinCode()){
				flag=false;
				throw new CityAlreadyExistsException();
				}
		}
		if(flag)
		{
			cityList.add(city);
			return cityList.size();
		}
		else
			return -1;
	}

	@Override
	public HashSet<Car> searchCarDetailsByCityNames(String cityname) {
		HashSet<Car> hs = new HashSet<Car>();
		// TODO Auto-generated method stub
		for(City city:cityList){
			if(city.getCityName()==cityname){
				hs.addAll(city.getCarListInCity());
				return hs;
			}
		}
		return null;
	}

	@Override
	public HashMap<String, Double> getTotalIncomeFromCity(String c) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm = new HashMap<String,Double>();
		double income;
		City city=null;
		for( City cty: cityList){
			if(cty.getCityName()==c)
				city=cty;
		}
		income = city.getCityCharge();
		for(Car car : city.getCarListInCity()){
			income = income * car.getCharge();
		}
		hm.put(c, income);
		return null;
	}
	
	

}
