public class Bus extends Ride{
    Bus(int number){
        super(number);
        this.name = "버스";
        this.cost = 1000;
        System.out.println(this.name+"비용: "+this.cost);
    }
    @Override
    void take() {
        passengerCount++;
        income += this.cost;
    }

    @Override
    void take(int total) {

    }
}
