import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine()); //scanner보다 속도↑

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilders = new StringBuilder(); //긴 문자열을 더할 때 String보다 효율↑

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), ","); //,로 구분

            while (stringTokenizer.hasMoreTokens()) {
                stringBuilders.append(stringTokenizer.nextToken());
                stringBuilders.append(' '); //,를 띄어쓰기로
            }
        }
            System.out.println(stringBuilders.toString());
    }
}