// С потоком связан файл
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Primer1_1 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream("c:/tmp/text.txt");
            Primer1.readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}