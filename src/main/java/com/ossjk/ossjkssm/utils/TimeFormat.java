package com.ossjk.ossjkssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
	public static String change(Date date) {
		SimpleDateFormat sd=new SimpleDateFormat("YY-MM-dd HH:mm:ss");
		String newdate=sd.format(date);
		return newdate;
	}
}
