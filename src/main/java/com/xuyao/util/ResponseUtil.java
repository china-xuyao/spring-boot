package com.xuyao.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseUtil {
	public enum StatusEnum {
		get,
		post,
		delete,
		put,
		succeed,
		failure
	}
	
	/**
	 * By StatuEnum Get HTTP Status Code
	 * @param statusEnum
	 * @return
	 * XuYao
	 */
	public static String getStatus(StatusEnum statusEnum) {
		String resultCode = "500";
		switch (statusEnum) {
		case get:
			resultCode = "200";
			break;
		case post:
			resultCode = "201";
			break;
		case delete:
			resultCode = "200";
			break;
		case put:
			resultCode = "200";
			break;
		case succeed:
			resultCode = "200";
			break;
		case failure:
			resultCode = "400";
			break;
		default:
			break;
		}
		return resultCode;
	}
	
	/**
	 * HTTP Response Info
	 * @param statuEnum
	 * @param statusText 
	 * @param data
	 * @return
	 * XuYao
	 */
	public static <T> Map<String, T> result(StatusEnum statusEnum, String statusText, T data) {
		Map<String, T> map = new HashMap<String, T>();
		map.put("data", data);
		map.put("statusText", (T) statusText);
		map.put("status", (T) getStatus(statusEnum));
		return map;
	}

	/**
	 * HTTP Response Info
	 * @param statusEnum
	 * @param statusText
	 * @return
	 * XuYao
	 */
	public static <T> Map<String, T> result(StatusEnum statusEnum, String statusText) {
		Map<String, T> map = new HashMap<String, T>();
		map.put("statusText", (T) statusText);
		map.put("statu", (T) getStatus(statusEnum));
		return map;
	}
	
}
