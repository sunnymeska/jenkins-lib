package com.cgi.notifications;

public class notification_test {
	
	String welcome;
	String welcome2;
	
	notification_test(String welcome,String welcome2) {
		
		this.welcome=welcome;
		this.welcome2=welcome2;
				
		
	}
	
	def printall(){
		println "Welcome=${this.welcome} and Welcome2=${this.welcome2}";
	}

}
