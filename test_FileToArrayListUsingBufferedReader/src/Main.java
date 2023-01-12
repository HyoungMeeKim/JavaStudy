import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static ArrayList<ArrayList<String>>arr2Result=new ArrayList<ArrayList<String>>(); //2차원 arraylist
    public static void main(String[] args) {
        readArr2("sudoku.txt");
        prntArray();
    }

    public static ArrayList<ArrayList<String>> readArr2(String txtFileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(txtFileName)));

            String str;

            while ((str = br.readLine()) != null) {

                if (str.trim().isEmpty()) continue;

                String[] colm = str.split(" ");
                ArrayList<String> arr = new ArrayList<String>();

                for (int i = 0; i < colm.length; i++) {
                    arr.add(colm[i].trim());
                }

                arr2Result.add(arr);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }

        // 결과 반환
        return arr2Result;
    }

    public static void prntArray() {
        for (int i = 0; i < arr2Result.size(); i++) {
            System.out.println(arr2Result.get(i));
        }
    }
}


