package com.amazon.utils;

public class CommonUtil {

	public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}