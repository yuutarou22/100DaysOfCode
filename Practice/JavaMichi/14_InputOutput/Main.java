import java.io.*;

/**
 * 入出力処理は、java.ioパッケージに含まれるクラスで担う。
 */
class Main {
    public static void main(String[] args) {
        try {
            File inFile = new File("abc.txt");
            File outFile = new File("xyz.txt");
            FileReader in = new FileReader(inFile);
            FileWriter out = new FileWriter(outFile);

            int contents;

            while((contents = in.read()) != -1) {
                out.write(contents);
            }

            in.close();
            out.close();
        } catch (IOException e) {
        }
    }
}