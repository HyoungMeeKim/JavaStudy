public class Hero {
    String name;
    int HP, speed, damage;

    Hero(String name, int HP, int speed, int damage) {
        System.out.println(name + "가 생성되었습니다.");
        this.name = name;
        this.HP = HP;
        this.speed = speed;
        this.damage = damage;

    }

    public void move() {
        System.out.println(name + "이 " + speed + "의 속도로 이동합니다.");
    }

    public void eSkill() {
        System.out.println(name + "이 스킬을 사용했습니다.");
    }

    public String getDetailInfo() {
        return "이름: " + name + "\nHP: " + HP + "\nspeed: " + speed + "\ndamage: " + damage;
    }

    public void attack(Hero enemy) {
        System.out.println(this.name + "이 " + enemy.name + "을 공격해서 체력을 " + enemy.HP + "에서 " + (enemy.HP - this.damage) + "로 깍았습니다.");
        enemy.HP -= this.damage;
    }
}
