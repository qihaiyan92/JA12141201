package d_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map的基本使用
 * HashMap:元素无序存放
 * TreeMap:有序
 * */

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//1、添加元素
		System.out.println(map.put(null, null));
		System.out.println(map.put(123, "google"));   //key不存在，返回null
		System.out.println(map.put(123, "apple"));     //put 返回key上次对映的value,覆盖原值
		map.put(321, "baidu");
		map.put(11, "alibaba");
		System.out.println(map);
		
		//2、删除元素
//		System.out.println(map.remove(1)); //key不存在时，null
//		System.out.println(map.remove(11));//存在，移除键值对，并返回value		
//		System.out.println(map);
		
//		map.clear();
//		System.out.println(map);
		
		//3、判断操作
//		if (map.containsKey(120)) {
//			System.out.println("key存在");
//		}else {
//			System.out.println("key不存在");		
//		}
//		
//		if (map.containsValue("baidu")) {
//			System.out.println("value存在");
//		}else {
//			System.out.println("value不存在");		
//		}
//		
//		if (map.isEmpty()) {
//			System.out.println("map空");
//		} else {
//			System.out.println("map非空："+map.size());
//		}
		
		
		//4、获取
		System.out.println(map.get(123));
		System.out.println(map.get(119));  //119不存在，返回null
		System.out.println("------------------------");
		/*
		 * 5、遍历操作：map没有迭代器
		 *   a、得到key的set集合
		 * 	 b、使用该set集合的迭代器，去遍历key
		 *   c、使用get + 迭代器==遍历value
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
		 * 使用entrySet()把map集合转换成：set集合，使用迭代器迭代；
		 * Map.Entry类型：映射项=键值对 【键-值】
		 * */
		Set<Map.Entry<Integer, String>> entryset = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 = entryset.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> entry =  it2.next(); //与下面一样
			//Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) it2.next();
//			Integer key = entry.getKey();
//			String value1 = entry.getValue();
//			System.out.println("key:"+key+"\tvalue1:"+value1);
			System.out.println(entry);   //entry.toString();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
