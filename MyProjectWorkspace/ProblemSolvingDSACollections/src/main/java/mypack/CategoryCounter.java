package mypack;

import java.util.*;

public class CategoryCounter {
	static int counter = 0;
	
	public static void main(String[] args) {
		Car c1 = new Car(++counter, "Hyundai", "red");
		Car c2 = new Car(++counter, "Kia", "red");
		Car c3 = new Car(++counter, "Ford", "red");
		
		Car c4 = new Car(++counter, "Toyata", "blue");
		Car c5 = new Car(++counter, "Mercedez", "blue");
		
		
		Car c6 = new Car(++counter, "Elantra", "green");
		
		Car c7 = new Car(++counter, "Tesla", "orange");
		
		List<Car> cars = new ArrayList<>();
		cars.add(c1);cars.add(c2);cars.add(c3);cars.add(c4);cars.add(c5);cars.add(c6);
				
	    printCountOfCarsByColor(cars);//brute force
	    
	    printCountOfCarsByColorOptimized(cars);//brute force
	}

	private static void printCountOfCarsByColorOptimized(List<Car> cars) {//red:3, blue:2, green:1
		Map<String, Integer> map = new HashMap<>();
		
		
		for(Car car : cars) {
			 if(!map.containsKey(car.getColor())) {
				 map.put(car.getColor(), 1);
			 }else {
				 int count = map.get(car.getColor());
				 map.put(car.getColor(), ++count);
			 }
		}
		
		System.out.println(map);
		
	}

	private static void printCountOfCarsByColor(List<Car> cars) {
		int redCount = 0; int blueCount = 0; int greenCount = 0;
		
		for(Car car : cars) {
		  if (car.getColor().equals("red")) {
			  ++redCount;
		  }else if(car.getColor().equals("blue")) {
			  ++blueCount;
		  }else {//green
			  ++greenCount;
		  }
		}
		
		System.out.println("Red:" + redCount + ", Blue:" + blueCount + ", Green: " + greenCount);
		
	}
}

class Car{
	private int id;
	private String name;
	private String color;
	
	public Car(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}