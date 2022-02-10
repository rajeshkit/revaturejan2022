package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamDemo3 {
	public static void main(String[] args) {
		File f=new File("f:/trainee.txt");
		try(FileReader fis=new FileReader(f);) {
			
			int content = 0;
			while((content=fis.read())!=-1) {
				System.out.print((char)content);
			}
			
			
			
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
