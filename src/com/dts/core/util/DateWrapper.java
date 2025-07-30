package com.dts.core.util;

import java.util.Date;

public class DateWrapper {

	static String month[] = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL",
			"AUG", "SEP", "OCT", "NOV", "DEC" };

	public static String parseDate(Date date) {
		int monthid = date.getMonth();
		String newdate = (new StringBuilder(String.valueOf(date.getDate())))
				.append("-").append(month[monthid]).append("-")
				.append(date.getYear() + 1900).toString();
		System.out.println((new StringBuilder("new date==")).append(newdate)
				.toString());
		return newdate;
	}

	public static String parseDate(String date) {
		int monthid = Integer.parseInt(date.substring(date.indexOf("-") + 1,
				date.lastIndexOf("-")));
		String newdate = (new StringBuilder(String.valueOf(date.substring(0,
				date.indexOf("-")))))
				.append("-")
				.append(month[monthid - 1])
				.append("-")
				.append(date.substring(date.lastIndexOf("-") + 1, date.length()))
				.toString();
		return newdate;
	}

	public static String parseDate(java.sql.Date date) {
		String olddate = date.toString();
		String newdate = (new StringBuilder(String.valueOf(olddate.substring(
				olddate.lastIndexOf("-") + 1, olddate.length()))))
				.append("-")
				.append(olddate.substring(olddate.indexOf("-") + 1,
						olddate.lastIndexOf("-"))).append("-")
				.append(olddate.substring(0, olddate.indexOf("-"))).toString();
		return newdate;
	}

}
