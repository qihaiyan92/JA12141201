import java.util.Comparator;


public class ComByLength implements Comparator<String>{
	//str�Ӷ̵���
	@Override
	public int compare(String o1, String o2) {
		
		return o1.length() - o2.length();
	}

}
