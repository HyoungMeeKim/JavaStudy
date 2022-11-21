import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static String[] name = new String[100];
    static String[] phoneNum = new String[100];
    static int index = 0;
    static String txtFileName = "bike_retailer_text.txt";

    public static void main(String[] args) throws IOException {
        readFile();

        while (true) {
            BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("메뉴를 고르세요.\n 1. 검색 2. 추가");
            int menu = Integer.parseInt(bufferedReader1.readLine());

            switch (menu) {
                case 1:
                    System.out.println("지점을 입력하세요");
                    String name_searching = bufferedReader1.readLine();
                    search(name_searching);
                    break;
                case 2:
                    System.out.println("추가할 지점의 이름을 입력하세요.");
                    String insertName = bufferedReader1.readLine();
                    System.out.println("추가할 지점의 번호를 입력하세요.");
                    String insertNum = bufferedReader1.readLine();
                    Insert(insertName, insertNum);
                    readFile();
                default:
                    System.out.println("ERROR");
            }
        }
    }

    public static void readFile() throws IOException {
        File file = new File(txtFileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
//        while ((line = bufferedReader.readLine()) != null) { 아래 while~else 까지는 이 한 문장으로 대체 가능
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(line, ",");

                name[index] = stringTokenizer.nextToken();
                phoneNum[index] = stringTokenizer.nextToken();
                index++;
            }
        }
    }
    public static void search(String str) {
        int index_searching = 0;

        while (!str.equals(name[index_searching])) {
            index_searching++;
            if (index_searching > index) {
                System.out.println("찾는 지점의 번호가 없습니다.");
                break;
            }
        }
        if (index_searching < index) {
            System.out.println(str + "의 번호는 " + phoneNum[index_searching] + "입니다.");
        }
    }

    public static void Insert(String insertName, String insertNum) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(txtFileName, true));
        String line = "\n" + insertName + "," + insertNum;
        printWriter.print(line);
        printWriter.close();
    }
}
