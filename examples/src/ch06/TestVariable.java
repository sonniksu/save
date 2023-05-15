package ch06;

public class TestVariable {
static {
	System.out.println("static initializer");
}
{
	System.out.println("instance initializer");
}
static String classVariable = "class변수";
String memberVariable ="member변수";
TestVariable(){
	System.out.println("생성자 호출");
}

static void staticMethod(String argument) {
	System.out.println(argument);
}
void memberMethod() {
	String localVariable = "local변수";
	System.out.println(localVariable);
}
	

	public static void main(String[]args) {
		
	System.out.println(TestVariable.classVariable);
	TestVariable.staticMethod("argument(매개)변수");
	TestVariable tv = new TestVariable();
	System.out.println(tv.memberVariable);
}
}
