package ch06;

public class TestVariable {
static {
	System.out.println("static initializer");
}
{
	System.out.println("instance initializer");
}
static String classVariable = "class����";
String memberVariable ="member����";
TestVariable(){
	System.out.println("������ ȣ��");
}

static void staticMethod(String argument) {
	System.out.println(argument);
}
void memberMethod() {
	String localVariable = "local����";
	System.out.println(localVariable);
}
	

	public static void main(String[]args) {
		
	System.out.println(TestVariable.classVariable);
	TestVariable.staticMethod("argument(�Ű�)����");
	TestVariable tv = new TestVariable();
	System.out.println(tv.memberVariable);
}
}
