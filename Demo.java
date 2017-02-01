package com;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(1,"maruti","ajay","delhi",50);
		Car c2 = new Car(2,"honda","rehan","fbd",30);
		Car c3 = new Car(3,"maru","ajy","dhi",40);
		Car c4 = new Car(1,"mti","ay","dehi",60);
		Car c5 = new Car(1,"mti","aj","delh",50);
		
		City city = new City(1,"fbd",121001,100);
		//City city1 = new City(2,"delhi",12001,200);
	
				
		CarRentalManagement crm = new CarRentalManagement();
		
		
		try{
		crm.addCity(city);
		//crm.addCity(city);
		System.out.println(crm.addCar(c1));
		System.out.println(crm.addCar(c1));
		//System.out.println(crm.addCar(c3));
		//System.out.println(crm.addCar(c4));
		}
		
		catch(CarAlreadyExistsException ex){
			System.out.println("CarAlreadyExistsException");
		}
		catch(CityAlreadyExistsException ex){
			System.out.println("CityAlreadyExistsException");
		}
	}

}
