package file;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. 与平台无关的， 目录、文件
 * 				创建、删除、重命名...
 * File类：不能直接访问内容本身，----使用输入、输出流来对内容本身修改
 * */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// . 代表当前路径     ..  上一目录
		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());    //string
		System.out.println(file.getAbsoluteFile());    //file
		System.out.println(file.getAbsoluteFile().getParent());
		System.out.println(file.getParent());
				
		//创建文件
		File tmpfile = File.createTempFile("tem_file", ".txt");
		File tmpFile2 = File.createTempFile("tmp_file", ".txt", file);
		//当JVM退出，删除
		tmpfile.deleteOnExit();
		tmpFile2.deleteOnExit();
		
		//创建文件
		File file2 = new File("create_bycode");
		//File file2 = new File("create_bycode/sub_dir/sub_dir");
		//File file2 = new File("create_bycode\\sub_dir\\sub_dir"); //功能同上
		System.out.println("存在 = "+file2.exists());
		
		//在同一目录：不能创建同名的文件、文件夹
		System.out.println(file2.createNewFile());
		//System.out.println(file2.mkdir());
		//System.out.println(file2.mkdirs());
		
		System.out.println("存在 = "+file2.exists());
		System.out.println("--------------------------");
		
		//如果file表示一个文件，那么list()将返回null
		String[] str_dir= file.list();
		String[] str_file = file2.list();
		System.out.println("str_dir="+str_dir
				+"\nstr_file="+str_file);
		
		//遍历
		System.out.println("打印当前路径下的文件、文件夹");
		for (String string : str_dir) {
			System.out.println(string);
		}
		System.out.println("--------------------------");
		
		//查看系统磁盘
		File[] roots = File.listRoots();  
		for (File root : roots) {
			System.out.println(root);
		}
		
		
		
		
	}

}
