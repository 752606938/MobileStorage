package com.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>����һ������������ </p>
 * @author ������
 * 2018��9��4��
 */
public class PubFun {
	
	private final static String pattern1 = "yyyy-MM-dd";
	private final static String pattern2 = "yyyyMMdd";
	private final static String pattern3 = "HH:mm:ss";
	
	public PubFun(){}
	
	/**
	 * �Ƚ��������ڴ�С
	 * @param StartDate ��ʼʱ��
	 * @param EndDate ����ʱ��
	 * @return �ȽϽ��
	 */
	public static boolean checkDate(String StartDate , String EndDate ){
		PubFun pub = new PubFun();
		Date start = pub.getDate(StartDate);
		Date end = pub.getDate(StartDate);
		if(start.after(end)){
			System.out.print("��ʼ���ڴ��ڽ������ڣ�");
			return false;
		}else{
			System.out.print("��ʼ����С�ڽ������ڣ�");
			return true;
		}
	}
	
	
	/**
	 * ������ϸ�ʽҪ��������ַ����������������ͱ���
	 * @param dateString
	 * @return
	 * @throws Exception 
	 */
	public Date getDate(String dateString){
		Date date = null;
		SimpleDateFormat df;
		try{
			if(dateString.indexOf("-")!=-1){
				df = new SimpleDateFormat(pattern1);
				date = df.parse(dateString);
			}else{
				df = new SimpleDateFormat(pattern2);
				date = df.parse(dateString);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return date;
	}
	
	/**
	 * �õ���ǰϵͳ����
	 * @return ��ǰ���ڵĸ�ʽ�ַ���,���ڸ�ʽΪ"yyyy-MM-dd"
	 */
	public static String getCurrentDate(){
		SimpleDateFormat df;
		df = new SimpleDateFormat(pattern1);
		Date today = new Date();
		return df.format(today);
	}
	
	/**
	 * �õ���ǰϵͳʱ��
	 * @return ��ǰ���ڵĸ�ʽ�ַ���,���ڸ�ʽΪ"HH:mm:ss"
	 */
	public static String getCurrentTime(){
		SimpleDateFormat df;
		df = new SimpleDateFormat(pattern3);
		Date time = new Date();
		return df.format(time);
	}
	

}
