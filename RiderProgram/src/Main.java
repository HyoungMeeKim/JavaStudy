public class Main {
    public static void main(String[] args) {
    Bus bus = new Bus(101);
    Subway subway = new Subway(2);
    Taxi taxi = new Taxi(5757);
        System.out.println();
        Person person = new Person("Steve",50000);

        person.takeRide(bus);
        bus.showInfo();
        System.out.println();

        person.takeRide(bus);
        bus.showInfo();
        System.out.println();

        person.takeRide(bus);
        bus.showInfo();
        System.out.println();

        person.takeRide(bus);
        bus.showInfo();
        System.out.println();

        person.takeRide(taxi,35);
        taxi.showInfo();
        System.out.println();

        person.takeRide(subway);
        subway.showInfo();
        System.out.println();}
}