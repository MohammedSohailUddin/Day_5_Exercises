package Exercise3;
import java.io.File;
public class ListOfFiles {
     public static void main(String args[])
     {
        File file = new File("C:\\Users\\Mohammed SohailUddin\\Desktop\\");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}

//Output:
//	Clsprogs.docx
//	day2cont.docx
//	desktop.ini
//	Eclipse IDE for Java Developers - 2022-09.lnk
//	Ex 2.docx
//	GitHub Desktop.lnk
//	try
