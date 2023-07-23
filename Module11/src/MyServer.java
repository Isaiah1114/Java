import java.io.*;
import java.net.*;

public class MyServer {

  //calculate if number is prime
  public static String isPrime(int n) {
    if(n<2)
    {
      return "No";
    }
    int i=2;
    while(i<n)
    {
      if(n%i==0)
      {
        return "No";
      }
      i++;
    }
    return "Yes";
  }

  //host on local port
  public static void main(String[] args){
    try
    {
      ServerSocket serverSocket=new ServerSocket(8080);
      Socket socket=serverSocket.accept();
      DataInputStream input=new DataInputStream(socket.getInputStream());
      DataOutputStream output=new DataOutputStream(socket.getOutputStream());

      int num = (int)input.readInt();

      output.writeUTF(isPrime(num));
      output.flush();

      output.close();
      serverSocket.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}