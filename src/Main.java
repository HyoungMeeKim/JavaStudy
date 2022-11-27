import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String inPW;
    static String outPW;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        inPW = bufferedReader.readLine();
        outPW = "";
        ConvertPW(inPW);
        System.out.println(outPW);
    }

    public static void ConvertPW(String inputPW) {
        outPW = "";
        for (int i = 0; i < inputPW.length(); i++) {
            int codeNum = inputPW.charAt(i);
            outPW += (char) (codeNum + 3);
        }
    }
}


/*
    public static String ConvertPW (String str){
        for (int i = 0; i < str.length(); i++) {
            int num = (int) (str.charAt(i));
            outPW += (char) (num + 3);
        }
        return outPW;
    }
*/
