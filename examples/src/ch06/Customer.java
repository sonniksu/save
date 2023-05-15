package ch06;

public class Customer {
	//field
	String id;
	String pw;
	String name;
	String tel="123";
	String addr;
	
	//constructor
	Customer(){
		
	}
	Customer(String id,String pw,String name){ //"id1","1234","kth"
		this.id=id;
		this.pw=pw;
		this.name=name;
	}
	Customer(String id,String pw,String name,String tel,String addr){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.tel=tel;
		this.addr=addr;
	}
	
	//method
	public String getTel(){
		return this.tel;
	}
}
