package d_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map�Ļ���ʹ��
 * HashMap:Ԫ��������
 * TreeMap:����
 * */

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//1�����Ԫ��
		System.out.println(map.put(null, null));
		System.out.println(map.put(123, "google"));   //key�����ڣ�����null
		System.out.println(map.put(123, "apple"));     //put ����key�ϴζ�ӳ��value,����ԭֵ
		map.put(321, "baidu");
		map.put(11, "alibaba");
		System.out.println(map);
		
		//2��ɾ��Ԫ��
//		System.out.println(map.remove(1)); //key������ʱ��null
//		System.out.println(map.remove(11));//���ڣ��Ƴ���ֵ�ԣ�������value		
//		System.out.println(map);
		
//		map.clear();
//		System.out.println(map);
		
		//3���жϲ���
//		if (map.containsKey(120)) {
//			System.out.println("key����");
//		}else {
//			System.out.println("key������");		
//		}
//		
//		if (map.containsValue("baidu")) {
//			System.out.println("value����");
//		}else {
//			System.out.println("value������");		
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("map��");
//		} else {
//			System.out.println("map�ǿգ�"+map.size());
//		}
		
		
		//4����ȡ
		System.out.println(map.get(123));
		System.out.println(map.get(119));  //119�����ڣ�����null
		System.out.println("------------------------");
		/*
		 * 5������������mapû�е�����
		 *   a���õ�key��set����
		 * 	 b��ʹ�ø�set���ϵĵ�������ȥ����key
		 *   c��ʹ��get + ������==����value
		 */
		Set<Integer> key_set = map.keySet();
		Iterator<Integer> it = key_set.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(map.get(integer));
		}
		
		System.out.println("------------------------");
		
		Collection<String> value = map.values();
		Iterator<String> it1 = value.iterator();
		while (it1.hasNext()) {
			String string = (String)it1.next();
			System.out.println(string);
		}
		
		System.out.println("------------------------");
		
		/*
		 * ʹ��entrySet()��map����ת���ɣ�set���ϣ�ʹ�õ�����������
		 * Map.Entry���ͣ�ӳ����=��ֵ�� ����-ֵ��
		 * */
		Set<Map.Entry<Integer, String>> entryset = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = entryset.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> entry =  it2.next(); //������һ��
			//Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it2.next();
//			Integer key = entry.getKey();
//			String value1 = entry.getValue();
//			System.out.println("key:"+key+"\tvalue1:"+value1);
			System.out.println(entry);   //entry.toString();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
