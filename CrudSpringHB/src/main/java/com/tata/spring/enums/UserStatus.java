package com.tata.spring.enums;

public enum UserStatus {
	
	ACTIVE("T"),
	INACTIVE("I");
	
	private String code;
	
	private UserStatus(String code){
		this.code= code;
	}

	public String getCode(){
		return this.code;
	}
	
	public static UserStatus fromString(String text){
		
		if(text!=null){
			for(UserStatus status: UserStatus.values()){
				if(text.equalsIgnoreCase(status.getCode())){
					return status;
				}
			}
		}
		
		return null;
	}
}
