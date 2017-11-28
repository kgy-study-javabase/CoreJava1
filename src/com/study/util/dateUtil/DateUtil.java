package com.study.util.dateUtil;

import java.util.Calendar;

public class DateUtil {
	public static void main(String[] args) {
		// 当前时间
		Calendar cl = setCalendar(2014, 01, 01);
		System.out.print("当前时间:");
		printCalendar(cl);
		// 前一天
		cl = setCalendar(2014, 01, 01);
		getBeforeDay(cl);
		System.out.print("前一天:");
		printCalendar(cl);
		// 后一天
		cl = setCalendar(2014, 01, 01);
		getAfterDay(cl);
		System.out.print("后一天:");
		printCalendar(cl);
	}

	/**
	 * 设置时间
	 * 
	 * @param year
	 * @param month
	 * @param date
	 * @return
	 */
	public static Calendar setCalendar(int year, int month, int date) {
		Calendar cl = Calendar.getInstance();
		cl.set(year, month - 1, date);
		return cl;
	}

	/**
	 * 获取当前时间的前一天时间
	 * 
	 * @param cl
	 * @return
	 */
	private static Calendar getBeforeDay(Calendar cl) {
		// 使用roll方法进行向前回滚
		// cl.roll(Calendar.DATE, -1);
		// 使用set方法直接进行设置
		int day = cl.get(Calendar.DATE);
		cl.set(Calendar.DATE, day - 1);
		return cl;
	}

	/**
	 * 获取当前时间的后一天时间
	 * 
	 * @param cl
	 * @return
	 */
	private static Calendar getAfterDay(Calendar cl) {
		// 使用roll方法进行回滚到后一天的时间
		// cl.roll(Calendar.DATE, 1);
		// 使用set方法直接设置时间值
		int day = cl.get(Calendar.DATE);
		cl.set(Calendar.DATE, day + 1);
		return cl;
	}

	/**
	 * 打印时间
	 * 
	 * @param cl
	 */
	public static void printCalendar(Calendar cl) {
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH) + 1;
		int day = cl.get(Calendar.DATE);
		System.out.println(year + "-" + month + "-" + day);
	}
}
