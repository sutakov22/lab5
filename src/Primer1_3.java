import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// С потоком связан массив типа byte
public class Primer1_3 {
    public static void main(String[] args) {
        try {
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            Primer1.readAllByByte(inArray);
            inArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}