import java.util.*;
import java.io.IOException;

public class Main{
  public static void main(String[] args){
    File f=new File("test1.txt);
    f.createNewFile();
    if(f.exists()){
      System.out.print("File Exists");
    }
  }
}
