package com._05_30;

import java.sql.SQLException;

public class CustomException extends SQLException{

	public CustomException(String msg){
		super("몰라");
	}
	
}
