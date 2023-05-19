 package Day2;

public class ShirtExam {
	public static void main(String[] args) {
		
		//객체생성
		Shirt s1 = new Shirt(); 
		s1.setName("코튼/린넨 버튼 다운 셔츠");
		s1.setColor("White");
		s1.setCompany("wow");
		s1.setMaterials("면 50%, 마 50%");
		s1.setSize("L");
		s1.setPrice(35000);
		s1.printInfo();

		
		Shirt s2 = new Shirt("린넨 밴드칼라 하프 플라켓 셔츠", "black", 25000);
		s2.setCompany("ty");
		s2.setMaterials("면50% , 마50%");
		s2.setSize("L");
		s2.printInfo();
		
		
		Shirt s3 = new Shirt("코튼/린넨 버튼 다운 셔츠", "blue","wow","면 50%, 마 50%","M", 30000);
		s3.printInfo();
		
	}

}

//출력값
//====Shirt Info====
//이름 :코튼/린넨 버튼 다운 셔츠
//컬러 :White
//회사 :wow
//소재 :면 50%, 마 50%
//사이즈 :L
//가격 :35000
//====Shirt Info====
//이름 :린넨 밴드칼라 하프 플라켓 셔츠
//컬러 :black
//회사 :ty
//소재 :면50% , 마50%
//사이즈 :L
//가격 :25000
//====Shirt Info====
//이름 :코튼/린넨 버튼 다운 셔츠
//컬러 :blue
//회사 :wow
//소재 :면 50%, 마 50%
//사이즈 :M
//가격 :30000
