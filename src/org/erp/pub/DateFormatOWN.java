package org.erp.pub;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatOWN {
	//����һ��������date����ת����String����
	public static String dateTOString(Date date){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}
	
	//����һ��������String����ת����date����
	public static Date stringToDate(String str){
		Date date = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = df.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
}
