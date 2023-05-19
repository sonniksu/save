package Day2; //반복 1회
	

	public class SunCream{
		
		String company;
		String product;
		boolean sticky;
		private char skintype;
		int amount;
		int protect;
		
		
		public void setSkintype(char skintype) {
			this.skintype=skintype;
		}
		
		
		
		public void printInfo() {
			System.out.println("==Suncream Info==");
			System.out.println("회사 = " + company);
			System.out.println("제품 = " + product);
			 
			if (sticky) {
				System.out.println("끈적임 = 있음");
			}else {
				System.out.println("끈적임 = 없음");
			}
			switch (skintype) {
			case 's':
				System.out.println("피부타입 : 민감성");
				break;
			case 'p':
				System.out.println("피부타입 : 건성");
			}
			System.out.println("용량 = " + amount);
			
			switch (protect) {
			case 10 :
				System.out.println("PA : +");
				break;
			case 20 : 
				System.out.println("PA : ++");
			}
				
			
			}
				
				
				
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



//	public class SunCream{
//		String company;
//		String product;
//		boolean sticky;
//		private char skinType;
//		int amount;
//		int protect;
//	
//		public void setSkinType(char c) { // = public void setSkinType(char skinType)
//			skinType = c; // this. skinType=skinType;
//		}
//
//		public void printInfo() {
//			System.out.println("====SunCream Info====");
//			System.out.println("회사 : " + company);
//			System.out.println("제품 : " + product);
//			if (this.sticky) {
//				System.out.println("끈적임 있음");
//			} else {
//				System.out.println("끈적임 없음");
//			}
//			switch (skinType) {
//			case 's':
//				System.out.println("피푸타입 : 민감성");
//				break;
//			case 'o':
//				System.out.println("피푸타입 : 지성");
//				break;
//			case 'n':
//				System.out.println("피푸타입 : 중성");
//				break;
//			case 'd':
//				System.out.println("피푸타입 : 건성");
//
//			}
//
//			System.out.println("용량 : " + amount + "(ml)");
//
//			switch (protect) {
//			case 10:
//				System.out.println("PA : +");
//				break;
//			case 20:
//				System.out.println("PA : ++");
//				break;
//			case 30:
//				System.out.println("PA : +++");
//				break;
//			case 40:
//				System.out.println("PA : ++++");
//			
//			}
//		}
//	}
//	


