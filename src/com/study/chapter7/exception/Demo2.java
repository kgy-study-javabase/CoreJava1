package com.study.chapter7.exception;

public class Demo2 {
	public static void main(String[] args) {
		try {
			int i = 1/0;
			System.out.println(i);
		} catch (Exception e) {
			Throwable se = new Exception("hhh");
			se.initCause(e);
			throw e;
		}
	}
}
