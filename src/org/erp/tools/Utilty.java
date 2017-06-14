package org.erp.tools;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *字符，时间，cookies等处理工具
 */
public class Utilty {
    public static String Substring(String input, int len) {
	if (DataValidator.isNullOrEmpty(input))
	    return "";
	if (len >= input.length())
	    return input;
	return input.substring(0, len);
    }
    
    public static Date getNowDateTime() {
	Calendar cal = Calendar.getInstance();
	String now = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE) + " "
		+ cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
	return DataConverter.toDate(now, "yyyy-MM-dd HH:mm:ss");
    }
    
    public static Date getNowDate() {
	Calendar cal = Calendar.getInstance();
	String now = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE);
	return DataConverter.toDate(now, "yyyy-MM-dd");
    }
    
    public static void writeCookie(HttpServletResponse response, String key, String value) {
	writeCookie(response, key, value, -1);
    }
    
    public static void writeCookie(HttpServletResponse response, String key, String value, int expirse) {
	Cookie newCookie;
	try {
	    newCookie = new Cookie(key, URLEncoder.encode(value, "utf-8"));
	    if (expirse > 0)
		expirse = expirse * 60;
	    newCookie.setPath("/");
	    newCookie.setMaxAge(expirse);
	    response.addCookie(newCookie);
	} catch (UnsupportedEncodingException e) {
	    e.printStackTrace();
	}
    }
    
    public static String readCookie(HttpServletRequest request, String key) throws UnsupportedEncodingException {
	String value = "";
	Cookie[] ck = request.getCookies();
	if (ck == null)
	    return "";
	for (Cookie c : ck) {
	    if (c.getName().equals(key)) {
		value = c.getValue();
		break;
	    }
	}
	return URLDecoder.decode(value, "utf-8");
    }
    /**
	 * 随机生成一个 32 位长度的 字符串( UUID )
	 * @return
	 */
	public static String random(){
		UUID uuid = UUID.randomUUID();//36位长度(包含了 四个 - )
		String uuidString = uuid.toString();
		uuidString = uuidString.replace("-", "");
		uuidString = uuidString.toUpperCase();
		return uuidString;
	}
	
	/**
	 * 对字符串进行MD5加密
	 * @param source 需要加密的字符串
	 * @return 返回加密后的字符串
	 */
	public static final String MD5(String source){
		if(source != null){
			StringBuffer md5 = new StringBuffer();
			MessageDigest md = null;
			try{
				md = MessageDigest.getInstance("MD5");
				md.update(source.getBytes());
				byte[] mdBytes = md.digest();
				
				for(int i = 0;i < mdBytes.length;i++){
					int temp;
					if(mdBytes[i] < 0){
						temp = 256+mdBytes[i];
					}else{
						temp = mdBytes[i];
					}
					if(temp < 16){
						md5.append("0");
					}
					md5.append(Integer.toString(temp,16 ));
				}
			}catch(NoSuchAlgorithmException e){
				e.printStackTrace();
			}
			return md5.toString().toUpperCase();
		}
		return null;
	}
}
