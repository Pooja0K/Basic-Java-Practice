package FileReading;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    public String getContentFromTextFile(String str) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(str);
        } catch (FileNotFoundException cause) {
            cause.getMessage();
        }
        // fileReader object is created which contains path/location of file

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // bufferReader object is created to read file But it reads only one line
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        //variable line is created to read each line in file and store its value in line variable
        while (true) {
            try {
                if (!((line=bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuffer.append(line);
            }
        //System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

        public static void main (String[]args) {

            ReadFile readFile = new ReadFile();
            readFile.getContentFromTextFile("D:\\Java\\test.txt");

        }
    }





