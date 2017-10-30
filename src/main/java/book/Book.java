package book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Book {

	
	public SizeTa size;
	
	
	public static void main(String [] args) throws IOException{
		int a = 1;
		Integer b = new Integer(a);
		
		String path = "E:\\EclipseWorkplace\\kingyea\\pratice\\src";
		File dir = new File(path);
		int count = countLine(dir);
		System.out.println(count);
	}
	
	public static int countLine(File file) throws IOException{
		int count = 0;
		System.out.println(file.getAbsolutePath());
		if(file.isDirectory()){
			File [] files = file.listFiles();
			if(null != files){
				for(File tt : files){
					count = count + countLine(tt);
				}
			}
			
			
			
		} else {
			FileReader reader = new FileReader(file);
			BufferedReader br=new BufferedReader(reader);
			String i= "";
			do{
				i = br.readLine();
				//System.out.println("ttt"+i+"ttt");
				if(i!=null && i.equals("")) continue;
				count ++;
			}while(i != null);
		}
		return count;
	}
	
	
}
