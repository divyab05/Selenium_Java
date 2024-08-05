package com.sendProEnterprise.utils;

import org.apache.commons.codec.binary.Base64;

public class Crypt {
	
	
	public static String encodeString(String input)
	{
	
		byte[] bytes = Base64.encodeBase64(input.getBytes());
		
		return new String(bytes);
		
	}
	
	public static String decodeString(String encodedString)
	{
		return new String(Base64.decodeBase64(encodedString.getBytes()));

	}
	
	
	public static void main(String []args)
	{
		System.out.println(Crypt.encodeString("S@ndsu1te41"));
	}
	
	
	
}
