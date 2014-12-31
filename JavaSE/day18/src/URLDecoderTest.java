import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class URLDecoderTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String keyWord = URLDecoder.decode("%B7%E8%BF%F1java","GBK");
		System.out.println(keyWord);
		String urlStr = URLEncoder.encode("·è¿ñAndroid½²Òå","GBK");
		System.out.println(urlStr);

	}

}
