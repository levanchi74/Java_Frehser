package test;

class Abc{
	static int x = 1;
}

public class main {
	

	public static void main(String[] args) {
		
		Abc a =  new Abc();
		Abc b = new Abc();
		b.x = 2;
		System.out.println(a.x);
		Abc.x = 3;
		System.out.println(b.x);

	}

}
