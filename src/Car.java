public class Car {

    String name;
    String company;
    String colour;
    String type;

    Car( String name, String company, String colour,String type){
        this.name=name;
        this.company=company;
        this.colour=colour;
        this.type=type;
    }
    void display_Car(){
        System.out.println("Name "+this.name);
        System.out.println("Company "+this.company);
        System.out.println("Color "+this.colour);
        System.out.println("type "+this.type);
    }

}
