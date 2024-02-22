import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());
        Set<String> wordsSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            wordsSet.add(reader.readLine());
        }

        List<String> wordsList = new ArrayList<>(wordsSet);

        // 길이가 짧은 것부터 정렬, 길이가 같으면 사전 순으로 정렬
        wordsList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); // 사전 순 정렬
                } else {
                    return Integer.compare(s1.length(), s2.length()); // 길이가 짧은 것부터 정렬
                }
            }
        });

        // 결과 출력
        for (String word : wordsList) {
            writer.write(word);
            writer.newLine();
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
