3rd
public class myfile {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
4th
    
package example1.example1;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class example1 {

	public static void main(String[] args) throws IOException,ParseException {
		// TODO Auto-generated method stub
JSONParser jsonparser=new JSONParser();
FileReader filereader=new FileReader(".\\jsonfile\\example1.json");
Object obj=jsonparser.parse(filereader);
JSONObject empobj=(JSONObject) obj;
String fname=(String) empobj.get("Firstname");
String lname=(String) empobj.get("Lastname");
System.out.println("Firstname:"+fname);
System.out.println("Lastname:"+lname);

	}

}
