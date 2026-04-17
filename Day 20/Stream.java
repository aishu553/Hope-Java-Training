import java.io.*;
import java.io.Exception;

public class Main{
  public static void main(String[] args){
    try{
    //   Student s1=new Student("Janu",004);
    //   FileOutputStream f=new FileOutputStream("test4.txt");
    //   ObjectOutputStream obj=new ObjectOutputStream(f);
    //   obj.writeObject(s1);
    //   obj.close();

    FileInputStream f=new FileInputStream("test4.txt");
    ObjectInputStream obj=new ObjectInputStream(f);
    Student s1=(Student) obj.readObject();
    System.out.println(s.name+" "+s.rno+" "+s.age);
    obj.close();
    }

  catch(IOException e){
    e.StackTrace();
  }
  catch(Exception e){
    e.StackTrace();
  }
  }
}
    
