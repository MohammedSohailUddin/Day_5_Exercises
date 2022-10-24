package Exercise2;
import java.io.File;
public class ExistOrNot {
       public static void main(String[] args) {
        // Create a File object
    	 File file_dir = new File("C:\\Users\\Mohammed SohailUddin\\Desktop\\try\\output.txt");
         if (file_dir.exists()) 
           {
            System.out.println("The Directory or File exists.\n");
           } 
         else
          {
            System.out.println("The Directory or File does not exist.\n");
          }
       }
  }

//Output:
//	The Directory or File exists.	