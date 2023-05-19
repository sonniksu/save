package Day2;

public class MobilePhoneExma {
	public static void main(String[] args) {
		
		MobilePhone mo1= new MobilePhone();
		
		mo1.company="삼성전자";
		mo1.product="Galaxy S23";
		mo1.os="안드로이드";
		mo1.color="black";
		mo1.pen=true;
		mo1.memory=12;
		mo1.storage=512;
		mo1.battery = 5000;
		
		mo1.printInfo();
		
	}
}



//출력값
//====Mobile phone Info====
//회사 : 삼성전자
//제품 : Galaxy S23
//운영체제 : 안드로이드
//컬러 : black
//펜: 지원
//메모리 : 12(GB)
//스토리지 : 512(GB)
//배터리 : 5000(mAH)