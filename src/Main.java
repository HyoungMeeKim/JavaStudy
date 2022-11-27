import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String inPW, inPW2, outPW, outPW2;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("암호를 입력하세요: ");
        inPW = bufferedReader.readLine();
        passwordToString(inPW);
        System.out.print("문장을 입력하세요: ");
        inPW2 = bufferedReader.readLine();
        StringToPassword(inPW2);
    }

    public static void passwordToString(String inPW) {
        outPW = "";
        for (int i = 0; i < inPW.length(); i++) {
            int codeNum = inPW.charAt(i);
            if (codeNum >= 88 && codeNum <= 90 || codeNum >= 120 && codeNum <= 122) {
                outPW += (char) (codeNum - 23);
            } else {
                outPW += (char) (codeNum + 3);
            }
        }
        System.out.println("실제 문장: " + outPW);
    }

    public static void StringToPassword(String inPW2) {
        outPW2 = "";
        for (int i = 0; i < inPW2.length(); i++) {
            int codeNum = inPW2.charAt(i);
            if (codeNum >= 65 && codeNum <= 67 || codeNum >= 97 && codeNum <= 99) {
                outPW2 += (char) (codeNum + 23);
            } else {
                outPW2 += (char) (codeNum - 3);
            }
        }
        System.out.println("암호: " + outPW2);
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
