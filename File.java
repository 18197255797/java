package package11;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File {
    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            str = in.readLine();
            FileWriter fw = new FileWriter("a.txt");
            fw.write(str);
            fw.close();
            System.out.println(str);
            }
        }



