package Ch_07;

public class _04_Method {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		
		b1.autoReport(); // 지원 안됨
		
		Blackbox.canAutoReport = true;
		
		b1.autoReport(); //지원됨
		
		b1.insertMemoryCard(256);
		
		
		//일반영상 : 1
		//이벤트 영상(충돌감지) : 2
		
		int filecount = b1.getVideoFileCount(1);
		System.out.println("일반영상 파일 수 : " + filecount + "개");
		
		filecount = b1.getVideoFileCount(2);
		System.out.println("일반영상 파일 수 : " + filecount + "개");
		
	}

}
