package com.regnant.session;

public class BusBean {
int id;
String bsource;
String bdestination;
String bdoj;
String btime;
String bname;
String btype;
String bcondition;
String bno;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
public String getBSource() {
	return bsource;
}
public void setBSource(String bsource) {
	this.bsource=bsource;
}
public String getBDestination() {
	return bdestination;
}
public void setBDestination(String bdestination) {
	this.bdestination=bdestination;
}
public String getBDOJ() {
	return bdoj;
}
public void setBDOJ(String bdoj) {
	this.bdoj=bdoj;
}
public String getBTime() {
	return btime;
}
public void setBTime(String btime) {
	this.btime=btime;
}
public String getBName() {
	return bname;
}
public void setBName(String bname) {
	this.bname=bname;
}
public String getBType() {
	return btype;
}
public void setBType(String btype) {
	this.btype=btype;
}
public String getBConditon() {
	return bcondition;
}
public void setBCondition(String bcondition) {
	this.bcondition=bcondition;
}
public String getBno() {
	return bno;
}
public void setBno(String bno) {
	this.bno=bno;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BusBean[id="+id+",source="+bsource+",destination="+bdestination+",bus_doj="+bdoj+",bus_time="+btime+",bus_name="+bname+",bus_type="+btype+",bus_condition="+bcondition+",bus_no="+bno+"]";
	}
}
