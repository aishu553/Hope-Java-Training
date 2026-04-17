import java.io.*;
import java.io.Exception;
public class Main{
  public static void main(String[] args){
    try{
    BufferedReader br=new BufferedReader(new FileReader("test.txt"));

  //First:
  int ch;
  while((ch=br.read())!=-1){
    System.out.println((char)ch);
  }

  //Second:
  String s;
  while((s=br.readLine())!=null){
    System.out.println(s);
  }
  br.close;
  }
  catch(Exception e){
     e.printStackTrace();
  }

  }
}
