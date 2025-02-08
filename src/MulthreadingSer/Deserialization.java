package MulthreadingSer;
import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("person.ser");
			ObjectInputStream in = new ObjectInputStream(file);
			Person person = (Person) in.readObject();
			in.close();
			file.close();
			System.out.print("Deserilized :"+person);
		}
		catch(IOException |ClassNotFoundException e) {
			System.out.println("Exception Caught:"+e.getMessage());
		}

}
}