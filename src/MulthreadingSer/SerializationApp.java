package MulthreadingSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationApp {
	public static void main(String[] args) {
		Person ObjP = new Person("dharani",1234);
		try {
			FileOutputStream file = new FileOutputStream("Person.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(ObjP);
			out.close();
			file.close();
			System.out.println("Object is serialized");
		}
		catch(IOException e) {
			System.out.println("Exception Caught:"+e.getMessage());
		}
		
	}

}
