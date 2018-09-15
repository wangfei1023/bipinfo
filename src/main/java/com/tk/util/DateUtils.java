package com.tk.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * 
 * @author WolfGo
 *
 */
public class DateUtils {
	
	
	/**
	 * @param sdate  yyyy-MM-dd HH:mm:ss
	 * @return Date
	 * 字符串日期类型转换成date类型
	 */

	public static Date stringToDate(String sdate) {
		Date date = null;

		if(sdate != null && sdate != "" ) {
			try {
				date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate);
			} catch (ParseException e) {
				e.printStackTrace();
			}			
		}

		return date;
	}
	
	
	/**
	 * 判断日期大小，
	 * @param first,second 字符串类型
	 * @return string (1、null 某个字符串为空  2、查询起期>查询止期  3、起止日期相同  4、查询起期<查询止期  else null)
	 */
	
	public static String compareDate(String first,String second) {
		
		if( (first == null || "".equals(first)) || (second == null) ||"".equals(second) ) {
			return null;
		}
		
		else if(stringToDate(first).getTime() > stringToDate(second).getTime()) {
			return ">";
		}
		
		else if(stringToDate(first).getTime() == stringToDate(second).getTime()) {
			return "=";
		}
		
		else if(stringToDate(first).getTime() < stringToDate(second).getTime()) {
			return "<";
		} else {
			return null;
		}
		
	}
	
	/**
	 * 获取要求的字符串日期格式
	 * 返回结果：yyyy-MM-dd HH:mm:ss
	 * 不够的用0补充
	 * 
	 * @param 字符串 strDate
	 * @return 格式化后日期字符串
	 * 
	 */
	
	//开始时间格式化
	public static String getStartDate(String strDate) {
		if( (strDate == null || "".equals(strDate))) {
			return null;
		}
		
		int len = strDate.length();
		
		if(len == 19) {
			return strDate;
		}
		else if(len == 10) {
			return strDate + " 00:00:00";
		}else {
			return null;
		}
		
	}
	//结束时间格式化
	public static String getEndDate(String strDate) {
		if( (strDate == null || "".equals(strDate))) {
			return null;
		}
		
		int len = strDate.length();
		
		if(len == 19) {
			return strDate;
		}
		else if(len == 10) {
			return strDate + " 23:59:59";
		}else {
			return null;
		}
		
	}

}
