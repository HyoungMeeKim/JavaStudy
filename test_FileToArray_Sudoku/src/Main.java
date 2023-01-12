import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String str = Files.readString(Paths.get("C:\\Users\\user\\Documents\\Sudoku.txt"));
        System.out.println("파일에서 읽어온 텍스트:\n" + str);
        String str1[] = str.split("\r\n");
        String[][] str2 = new String[str1.length][];
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i].split(" ");
        }
//        System.out.println("배열로 옮긴 후:\n" + Arrays.deepToString(str2));
        System.out.println("배열로 옮긴 후:");
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                System.out.print(str2[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
    Scanner scanner = new Scanner(new File("C:\\Users\\user\\Documents\\Sudoku.txt"));
    String[] arrayStr = new String[9];
        while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(" ");
                System.out.println(Arrays.toString(str));
                }
*/

