public abstract class Ride {
    String name;
    int number;
    int cost = 0;
    int income = 0;
    int passengerCount = 0;

    Ride(int number) {
        this.number = number;
        System.out.print(this.number + "번 ");
    }

    abstract void take();

    abstract void take(int total);

    void showInfo() {
        System.out.println(this.name + "의 승객은 총 " + passengerCount + "명 이고 , 총 수익은 " + income + "원 입니다.");
    }
}
