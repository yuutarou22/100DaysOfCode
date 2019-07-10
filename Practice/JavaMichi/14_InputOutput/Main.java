import java.io.FileReader;

import java.io.*;

/**
 * 入出力処理は、java.ioパッケージに含まれるクラスで担う。
 *  入出力クラスは主に2つに分けられる。
 * ※それぞれコンストラクタ（引数）が色々あるので、都度確認する。
 * 　・文字ストリーム用クラス（テキストなど16ビット文字の入出力）
 * 　　　ーFileReaderクラス
 * 　　　ーFileWriterクラス
 * 　・バイトストリーム用クラス（画像・圧縮データなどのバイナリデータの入出力）
 * 　　　ーFileInputStreamクラス
 * 　　　ーFileOutputStreamクラス
 * 　　　ーInputStreamReaderクラス
 * 　　　ーOutputStreamWriterクラス
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
            System.out.println("入出力エラーです" + e.getMessage());
        }
        ExIOMethod1();
        ExIOMethod2();
    }

    public static void ExIOMethod1() {
        System.out.println("ExIOMethod1 START");
        try {
            // ファイル名を指定し、FileReaderオブジェクトabcを生成
            FileReader abc = new FileReader("abc.txt");

            // FileDescriptorオブジェクトを指定して、FileReaderオブジェクトabcを生成
            FileReader def = new FileReader(FileDescriptor.in);

            // xyz.txtファイルの最後から書き込み処理を行うオブジェクトxyzを生成
            boolean judge = true;
            FileWriter xyz = new FileWriter("xyz.txt", judge);

            // Fileオブジェクト生成後、Fileオブジェクトを指定して
            // FileInputStreamオブジェクトAAAを生成
            File AAAFile = new File("AAA.gif");
            FileInputStream AAA = new FileInputStream(AAAFile);
        } catch(IOException e) {
            System.out.println("入出力エラーです" + e.getMessage());
        }
        System.out.println("ExIOMethod1 END");
    }

    public static void ExIOMethod2() {
        System.out.println("ExIOMethod2 START");
        // オブジェクトの生成、read、writeメソッド実行時、
        // チェック例外が起きる可能性があるのでtry-catch.
        try {
            // Inputオブジェクト生成
            FileInputStream abc = new FileInputStream("abc.txt");
            // Outputオブジェクト生成
            FileOutputStream xyz = new FileOutputStream("xyz.txt");
            // Readerオブジェクト生成
            InputStreamReader in = new InputStreamReader(abc, "EUC-JP");
            // Writerオブジェクト生成
            OutputStreamWriter out = new OutputStreamWriter(xyz, "Shift_JIS");

            int contents;

            // 読み込むデータがなくなるまで読み込み
            while((contents = in.read()) != -1) {
                // 書き込むデータがなくなるまで書き込む
                out.write(contents);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("入出力エラーです" + e.getMessage());
        }
        System.out.println("ExIOMethod2 END");
    }
}