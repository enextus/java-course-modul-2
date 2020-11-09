package lesson02;

/**
 * Class Car Test
 */
class CarTest {
    public static void main(String[] args) {
        Car myFirstCar = new Car();

        myFirstCar.win = "WER98709870";
        myFirstCar.km = 300;
        myFirstCar.move(300);
        System.out.println(myFirstCar.km);
    }
}
