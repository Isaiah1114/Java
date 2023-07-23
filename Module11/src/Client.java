import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

  //access local port
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try{
      Socket socket=new Socket("localhost",8080);
      DataInputStream dataInput=new DataInputStream(socket.getInputStream());
      DataOutputStream dataOutput=new DataOutputStream(socket.getOutputStream());

      System.out.print("\nEnter a Number : ");
      int num = scan.nextInt();

      dataOutput.writeInt(num);
      String ans = (String)dataInput.readUTF();
      System.out.println("\nNumber "+num+
              " Is Prime Number: "+ans);
      dataOutput.flush();
      dataOutput.close();
      socket.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
    scan.close();
  }
}