package src;

import java.unit.Calendar;
import java.unit.GregorianCalendar;


public class CarMethods {
    public sortByCompany(List<Car> ListOfCars, String company) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (Car car : ListOfCars) {
            if (car.getCompany() == company) {
                newListCars.add(car));
            }
        }
        return newListCars;
    }

    public sortByCompanyAndYear(List<Car> ListOfCars, String company, int countOfYear) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        currentYear = new GregorianCalendar().get(Calendar.YEAR);
        for (Car car : ListOfCars) {
            if (car.getCompany() == company && countOfYear > (currentYear - car.getYear())) {
                newListCars.add(car));
            }
        }
        return newListCars;
    }

    public sortByYearAndPrice(List<Car> ListOfCars, int price, int year) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (Car car : ListOfCars) {
            if (car.getYear() == year && price > car.getPrice()) {
                newListCars.add(car));
            }
        }
        return newListCars;
    }
}