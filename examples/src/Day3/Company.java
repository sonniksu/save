package Day3;

public class Company {

	String companyName;
	String address;
	String phone;

	public Company(String companyName, String address, String phone) {
		this.companyName = companyName;
		this.address = address;
		this.phone = phone;
	}

	public void printInfo() {
		System.out.println("회사명 = " + companyName);
		System.out.println("주소 = " + address);
		System.out.println("전화번호 = " + phone);
	}
}
