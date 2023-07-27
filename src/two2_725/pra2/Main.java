package two2_725.pra2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
//            File file = new File("nikujaga.txt");
        	File file = new File("./nikujaga.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("ファイル作成エラー：");
            e.printStackTrace();
        }


        try (FileWriter fileWriter = new FileWriter("nikujaga.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("carrot\n");
            bufferedWriter.write("potato\n");
            bufferedWriter.write("meat\n");
            bufferedWriter.write("onion\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ファイルの読み
        try (FileReader fileReader = new FileReader("nikujaga.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
