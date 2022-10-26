public class Person {
    String name;
    int money;

    Person(String name, int money){
        this.name=name;
        this.money=money;
        System.out.println("승객 "+this.name+"은 "+this.money+"원의 돈을 갖고 있습니다.");
    }

    void takeRide(Ride ride){
        ride.take();
        this.money-=ride.cost;
        System.out.println(this.name+"이 " +ride.name+"을 타고" +ride.cost+"원을 지불해" +this.money+"원이 남았습니다.");
    }
    void takeRide(Taxi taxi, int time){
        taxi.take(taxi.meter(time));
        this.money-=taxi.cost;
        System.out.println(this.name+"이 " +taxi.name+"을 타고" +taxi.cost+"원을 지불해" +this.money+"원이 남았습니다.");
    }
}
