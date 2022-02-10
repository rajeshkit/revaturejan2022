package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo {
	public static void main(String[] args) {
		File f=new File("f:/trainee.txt");
		try(FileInputStream fis=new FileInputStream(f);) {
			
			int content = 0;
			while((content=fis.read())!=-1) {
				System.out.print((char)content);
			}
			
			System.out.println(content);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			try {
//				fis.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
