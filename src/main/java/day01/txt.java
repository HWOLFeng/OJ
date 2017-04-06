package day01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static java.lang.System.out;

/**
 * Created by HWOLF on 2017/2/24.
 */
public class txt {
    public static void main(String[] args) {
        try {InputStream f = new FileInputStream("F:/Project/test_list.txt");
        int size = f.available();
        for (int i = 0;i<size;i++){

                out.print((char)f.read());
            }
        } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

