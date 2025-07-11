public class Main {
    public static void main(String[] args) {
        Car my_Car= new Car("Kia Sportage","Kia Corporation","White","SUV");
        Car mini_Car= new Car("Civic","honda","Black","sedan");
        System.out.println("For "+my_Car.name);
        my_Car.display_Car();
        System.out.println("For "+ mini_Car.name);
        mini_Car.display_Car();
    }
}