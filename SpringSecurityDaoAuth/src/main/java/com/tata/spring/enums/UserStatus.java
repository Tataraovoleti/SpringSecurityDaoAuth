package com.tata.spring.enums;

/**
*
* @author Tatarao voleti
* @date   May 22, 2015
*/
public enum UserStatus {
	
	ACTIVE("ACTIVE"),
	INCATCIVE("INACTIVE");
	
	private String code;
	
	private UserStatus(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}
	
	public static UserStatus fromString(String text){
		
		if(text!=null){
			for(UserStatus status :UserStatus.values()){
				if(text.equalsIgnoreCase(status.getCode())){
					return status;
				}
			}
		}
		
		return null;
	}

}
