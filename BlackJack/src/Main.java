import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        System.out.println(find(arr, N, M));
    }

    public static int find(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    System.out.println(k + " " + j + " " + i + ", 합: " + (arr[k] + arr[j] + arr[i]) + ", count: " + count);
                    count++;
                    if (arr[i] + arr[j] + arr[k] == M) {
                        return arr[i] + arr[j] + arr[k];
                    }
                    if (result < arr[i] + arr[j] + arr[k] && arr[i] + arr[j] + arr[k] <= M) {
                        result = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        return result;
    }
}