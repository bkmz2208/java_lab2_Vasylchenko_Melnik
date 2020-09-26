package src;

public class CarMethods {
    public sortByMark(List[] ArrayCars, String mark) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (int i = 0; i < ArrayCars.length; i++) {
            if (ArrayCars(i).getMark() == mark){
                newListCars.add(ArrayCars(i));
            }
        }
        return newListCars;

    }

    public sortByMarkAndYear() {

    }

    public sortByYearAndPrice() {

    }
}