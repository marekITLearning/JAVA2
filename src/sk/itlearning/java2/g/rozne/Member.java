package sk.itlearning.java2.g.rozne;

public class Member {

	// 1 clenske premenne
	int a;
	private static int b;

	// 2 clenske metody
	void a() { }

	static void b() { }

	// 3 konstruktory
	public Member(int x) {
		super();
		a = x;
	}

	@SuppressWarnings("unused")
	private Member() {
		super();
	}

	// 4 vnorene triedy
	// vnorena nestaticka - inner class
	class X {
		void test() {
			System.out.println("Print variable a from inner class Member.X : " + a);
			System.out.println("Print variable b from inner class Member.X : " + b);
		}
	}

	// vnorena staticka - static nested class
	static class Y {
		void test() {
			System.out.println();
			System.out.println("Print variable b from static nested class Member.Y : " + b);
		}
	}

	// 5 inicializacne bloky
	{
		a = 8;
	}

	static {
		b = 5;
	}

}
