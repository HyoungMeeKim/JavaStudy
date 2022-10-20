public class Main {
    public static void main(String[] args) {
        Hero hanzo = new Hero("hanzo", 100, 50, 70);
        Hero lucio = new Hero("lucio", 80, 100, 40);

        hanzo.move();
        hanzo.eSkill();
        System.out.println(hanzo.getDetailInfo());

        lucio.move();
        lucio.eSkill();
        System.out.println(lucio.getDetailInfo());

        hanzo.attack(lucio);
        lucio.attack(hanzo);

        System.out.println(hanzo.getDetailInfo());
        System.out.println(lucio.getDetailInfo());
    }
}

