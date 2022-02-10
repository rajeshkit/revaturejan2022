package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
	public static void main(String[] args) {
		// java code have data -> file system by using byte stream
		String message="revature how are you, welcome revature,chennai"
				+ "mumbai india usa";
		File f=new File("f:/trainee.txt");
		try {
			FileOutputStream fos=new FileOutputStream(f);
			byte[] b = message.getBytes();
			fos.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
