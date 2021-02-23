package dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
      this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (capacity > data.size()) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getModel().equals(model) && car.getManufacturer().equals(manufacturer)) {
                data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        Car car = new Car();
        int latestYear = -1;
        for (Car car1 : data) {
            if (car1.getYear() > latestYear) {
                car = car1;
                latestYear = car1.getYear();
            }
        }
        if (latestYear != -1) {
            return car;
        }
        return null;
    }

    public Car getCar(String manufacture, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacture) && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The cars are in a car dealership " + name + ":");
        sb.append(System.lineSeparator());
        for (Car car : data) {
            sb.append(car);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}


//⦁	getStatistics() – returns a String in the following format:
//⦁	" The cars are in a car dealership {name}:
//{Car1}
//{Car2}
//(…)"