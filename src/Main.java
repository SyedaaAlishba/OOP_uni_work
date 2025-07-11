public class Main {
    public static void main(String[] args) {
        Car my_Car= new Car("Kia Sportage","Kia Corporation","White","SUV");
        Car mini_Car= new Car("Civic","honda","Black","sedan");

       Car[] array= {my_Car,mini_Car};
        for (Car car : array) {
            car.display_Car();
        }

    }
}