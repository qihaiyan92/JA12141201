
import java.util.TreeSet;

/*
 * ���ͣ��ڳ�����ʹ��<>��ָ����������
 *      ����������Ķ��塢�ӿڶ��塢�������塢����
 * 1��������ʱ������ǰ������ʱ�����緢�ִ���
 * 2��������ǿ������ת�����鷳
 * */
public class GenericDemo {

	public static void main(String[] args) {
		
		//TreeSet ts = new TreeSet();
		TreeSet<String> ts = new TreeSet<>();
		ts.add("google");
		//ts.add(123);    //������ʱ������ǰ������ʱ�����緢�ִ���
		System.out.println(ts);
		
		for (Object object : ts) { //��ʹ�÷���
			String str = (String)object;
			System.out.println(str);
		}
		
		for (String string : ts) {  //ʹ�÷���
			System.out.println(string);
		}
	}

}
