package moth11.InputStrenm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Study01 {

	/**
	 * 在控制台输入一段换回车，然后在制定的目录中写入
	 * @throws IOException 
	 */
	public static File  createFile(String filePath) throws IOException{
		File file=new File(filePath);
		if(!file.isDirectory()){
			System.out.println("文件目录不存在！创建制定文件目录");
			file.mkdir();
		}else if(!file.exists()){
			System.out.println("文件不存在！创建制定文件");
			file.createNewFile();
		}else {
			return file;
		}
		return file;
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in); 
        System.out.println("请输入字符串："); 
        while (true) { 
                String line = s.nextLine(); 
                if (line.equals("exit")) break; 
                System.out.println();
                String filePath="E:/软通文档/test.txt";
                File file=createFile(filePath);
                if(file.exists()){
                	FileWriter fileWritter = new FileWriter(file.getName(),true);
                    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                    bufferWritter.write(line);
                    bufferWritter.close();
                }
           } 
     }
}
