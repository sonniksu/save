package Day1;

public class TeacherExam {

	public static void main(String[] args) {
		
		//object 1
		Teacher t1  = new Teacher();
		t1. setName("Sonn");
		t1. setAge(29);
		t1. setLesson("Java");
		String name = t1.getName();
		int age = t1.getAge();
		String lesson = t1.getLesson();
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("과목 :" + lesson);
		
		//object 2
		Teacher t2 = new Teacher();
		t2.setName("Park");
		t2.setAge(30);
		t2.setLesson("Music");
		t2.printInfo();
		
	
	}
}
