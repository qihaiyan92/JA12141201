package file;

import java.io.File;
import java.io.IOException;
/*
 * File:java.io. ��ƽ̨�޹صģ� Ŀ¼���ļ�
 * 				������ɾ����������...
 * File�ࣺ����ֱ�ӷ������ݱ���----ʹ�����롢������������ݱ����޸�
 * */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// . ����ǰ·��     ..  ��һĿ¼
		File file = new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());    //string
		System.out.println(file.getAbsoluteFile());    //file
		System.out.println(file.getAbsoluteFile().getParent());
		System.out.println(file.getParent());
				
		//�����ļ�
		File tmpfile = File.createTempFile("tem_file", ".txt");
		File tmpFile2 = File.createTempFile("tmp_file", ".txt", file);
		//��JVM�˳���ɾ��
		tmpfile.deleteOnExit();
		tmpFile2.deleteOnExit();
		
		//�����ļ�
		File file2 = new File("create_bycode");
		//File file2 = new File("create_bycode/sub_dir/sub_dir");
		//File file2 = new File("create_bycode\\sub_dir\\sub_dir"); //����ͬ��
		System.out.println("���� = "+file2.exists());
		
		//��ͬһĿ¼�����ܴ���ͬ�����ļ����ļ���
		System.out.println(file2.createNewFile());
		//System.out.println(file2.mkdir());
		//System.out.println(file2.mkdirs());
		
		System.out.println("���� = "+file2.exists());
		System.out.println("--------------------------");
		
		//���file��ʾһ���ļ�����ôlist()������null
		String[] str_dir= file.list();
		String[] str_file = file2.list();
		System.out.println("str_dir="+str_dir
				+"\nstr_file="+str_file);
		
		//����
		System.out.println("��ӡ��ǰ·���µ��ļ����ļ���");
		for (String string : str_dir) {
			System.out.println(string);
		}
		System.out.println("--------------------------");
		
		//�鿴ϵͳ����
		File[] roots = File.listRoots();  
		for (File root : roots) {
			System.out.println(root);
		}
		
		
		
		
	}

}
