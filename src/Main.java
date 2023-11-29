import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String[] inputLine = reader.readLine().split(" ");
            int q = Integer.parseInt(inputLine[1]);

            String s = reader.readLine();
            char[] str = s.toCharArray();

            for (int i = 0; i < q; i++) {
                String[] queryLine = reader.readLine().split(" ");
                int l = Integer.parseInt(queryLine[0]);
                int r = Integer.parseInt(queryLine[1]);
                int k = Integer.parseInt(queryLine[2]);
                char found = str[k];
                int match = 0;

                for (int j = l; j < r+1; j++) {
                    if (str[j] == found) {
                        match++;
                    }
                }

                if (match == 0) {
                    match = -1;
                }

                writer.write(match + "\n");
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Not found file");
        }
    }
}
