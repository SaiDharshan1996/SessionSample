package com.regnant.session;

public class UserBean {
String username;
String password;
public String getUname() {
	return username;
}
public void setUname(String username) {
	this.username=username;
}
public String getUPassword() {
	return password;
}
public void setUPassword(String password) {
	this.password=password;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserBean[username="+username+", password="+password+"]";
	}
}
