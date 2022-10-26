public class Subway extends Ride{
    Subway(int number){
        super(number);
        this.name = "지하철";
        this.cost = 1500;
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
