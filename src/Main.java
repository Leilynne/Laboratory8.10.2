import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter out = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("D:\\MyFile2.txt", "cp1251");

            for (int i = 0; i < 7; i++) {
                String line = br.readLine();
                if (i == 1 || (i > 1 && Double.parseDouble(line) > 0)) {
                    out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}

