package _0131;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class _readandwrite {
	public static void main(String[]args) throws IOException{
		File file=new File("/Users/lijialei/Documents/workspace/_0125/src/_0126/Cpu.java");
		File file1=new File("/Users/lijialei/Documents/workspace/_0125/src/_0126/Cpu1.java");
		Reader sum=new FileReader(file);
		char[] b=new char[(int)file.length()];
		sum.read(b);
		String src=new String(b);
		System.out.println(src);
		Writer str=new FileWriter(file1);
		str.write(src);
		str.flush();
		str.close();
		System.out.println("写入完成");
		
		
	}

}
