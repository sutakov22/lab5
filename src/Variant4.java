import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Variant4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\float\\input.txt");
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            File f2 = new File("C:\\float\\output.txt");
            f2.createNewFile();
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            int count = 0;
            try {
                while (true) {
                    float number = rd.readFloat();
                    if (number < 0) {
                        wr.writeFloat(number);
                        count++;
                    }
                }
            } catch (EOFException e) {
                wr.writeInt(count);
                wr.flush();
                wr.close();
                rd.close();
            }
        }
        catch (Exception e) {

        }
    }
}