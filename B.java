
public class B extends A {
	//method overloading
	void showMessage(String str,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(str);
		}
	}
	
	//method overriding
	void calculate(int n1,int n2) {
		super.calculate(20, 30);
		System.out.println(n1*n2);
	}

	//Default
	/*B(){
		System.out.println("Default of B");
	}
	
	//Parameterized
	B(String str,int x){
		super("Hello");
		System.out.println("x : "+x);
	}*/

}
