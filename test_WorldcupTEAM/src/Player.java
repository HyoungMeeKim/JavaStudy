public class Player extends Person {
    private int height;
    private int weight;
    private String position;
    private String currentTeam;

    public Player(String name, int age, String country, int height, int weight, String position, String currentTeam) {
        super(name, age, country);
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.currentTeam = currentTeam;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public void showList (){
        System.out.println("선수명: " + getName());
        System.out.println("나이: " + getAge());
        System.out.println("포지션: " + getPosition());
        System.out.println("키: " + getHeight());
        System.out.println("몸무게: " + getWeight());
        System.out.println("국가: " + getCountry());
        System.out.println("소속팀: " + getCurrentTeam());

    }
}




