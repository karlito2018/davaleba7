import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
   public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader objReader = new BufferedReader(new FileReader("C:/Users/karli/Desktop/wakitxva.txt"));

            String strCurrentLine;
            int i = 0;

            while ((strCurrentLine = objReader.readLine()) != null) {
                if(i%2==0){
                    System.out.println(strCurrentLine);
                }
                i++;
            }
        }
    }
