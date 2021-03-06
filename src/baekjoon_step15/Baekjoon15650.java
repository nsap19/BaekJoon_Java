package baekjoon_step15;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon15650 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //수의 범위(1~n)
        int r = Integer.parseInt(st.nextToken()); //뽑는 수의 갯수
        int[] arr = new int[n];
        int[] result = new int[r];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        combination(arr, result, visited, 0, n, r);

        bw.close();

    }

    private static void combination(int[] arr, int[] result, boolean[] visited, int start, int n, int r) throws IOException { //조합(n 개의 숫자 중에서 r 개의 수를 순서 없이 뽑는 경우)
        if (r == 0) { //더 뽑아야 할 갯수가 없을 때 print
            print(result);
            return;
        }

        //start에서 모든 경우의 수를 다 뽑은 후 i++이 됌
        for (int i = start; i < n; i++) { //visit 검사를 위한 for문, start보다 작으면 뽑을 후보에서 제외
            if (visited[i] != true) {
                visited[i] = true;
                result[result.length - r] = arr[i];
                combination(arr, result, visited, i + 1, n, r - 1); //start보다 큰 수 에서 수를 뽑기 위해 i+1에서 범위 시작
                visited[i] = false;
            }
        }


    }

    private static void print(int[] result) throws IOException {
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.newLine();
    }
}
