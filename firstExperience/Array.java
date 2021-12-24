package javastudy.ex1224.ex;

public class Array {
	
	private String number;
	private String name;
	private String addr;
	private String phonNumber;
	
	public Array(String number, String name, String addr, String phonNumber) {
		this.number=number;
		this.name=name;
		this.addr=addr;
		this.phonNumber=phonNumber;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
	
	
	
}
