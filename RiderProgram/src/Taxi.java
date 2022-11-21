public class Taxi extends Ride implements TaxiMeter {
    Taxi(int number) {
        super(number);
        this.name = "택시";
        System.out.println(this.name + "비용: 미정");
    }

    @Override
    void take() {
    }

    @Override
    void take(int total) {
        cost = total;
        passengerCount++;
        income += cost;
    }

    @Override
    public int meter(int time) {
        if (time > 50) {
            return 20000;
        } else if (time > 30) {
            return 10000;
        } else if (time > 10) {
            return 7000;
        } else {
            return 4000;
        }
    }
}
