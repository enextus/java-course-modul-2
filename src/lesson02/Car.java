package lesson02;

public class Car {

    /**
     *  Class Car
     */

    String brand;
    String win;
    String colorOfCar;
    int km;

    void move(int km) {
        km = km;
    }
}

class CarTest {

    /**
     * Class Car Test
     */

    public static void main(String[] args) {

        Car myFirstCar = new Car();

        myFirstCar.win = "WER98709870";
        myFirstCar.km = 300;
        myFirstCar.move(300);
        System.out.println(myFirstCar.km);
    }
}
