package com._0601;

public class exception {
	
	public void main(String[] args){

		String test = null;
		try{
			test.toUpperCase();
		}catch(Exception ex){ 
			System.err.println("name 파라미터가 올바르지 않습니다.");
		}
	}

}
