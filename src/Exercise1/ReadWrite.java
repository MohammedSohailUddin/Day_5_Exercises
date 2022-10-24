package Exercise1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class ReadWrite {
  public static void main(String[] args) {
	  //writing to the file
    try {
      PrintWriter output = new PrintWriter("C:\\Users\\Mohammed SohailUddin\\Desktop\\try\\output.txt");
      String name = "Mohammed Sohail Uddin";
      output.printf("My full name is: " +name);
      output.close();
    }
    catch(IOException e) {
      System.out.println("Exception caught is: "+e);
    }
    //reading the same file
    BufferedReader objReader = null;
    try {
     String input;
     objReader = new BufferedReader(new FileReader("C:\\Users\\Mohammed SohailUddin\\Desktop\\try\\output.txt"));
     while ((input = objReader.readLine()) != null) {
      System.out.println(input);
     }
    }
    catch (IOException e) {
        System.out.println("Exception caught is: "+e);
    }
  }
}

//Output:
//	My full name is: Mohammed Sohail Uddin