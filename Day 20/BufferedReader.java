import java.io.Exception;
import java.io.*;

public class Main{
  public static void main(String[] args){
    try{
      BufferedReader br=new BufferedReader(new FileReader("test.txt"));
      int ch=br.read();
      System.out.println((char)ch);
      String s=br.readLine();
      System.out.println(s);
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
