package exercicio.exercicio2;

public class TrocaDeValores {

	private int a;
	private int b;
	private int c;
	private int x;
	private int y;
	private int z;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void executarA() {
		setA(10);
		setB(20);
		System.out.println(getB());
		setB(5);
		System.out.println(getA() + " " + getB());
		System.out.println();
	}

	public void executarB() {
		setA(30);
		setB(20);
		setC(getA() + getB());
		System.out.println(getC());
		setB(10);
		System.out.println(getB() + " " + getC());
		setC(getA() + getB());
		System.out.println(getA() + " " + getB() + " " + getC());
		System.out.println();
	}

	public void executarC() {
		setA(10);
		setB(20);
		setC(getA());
		setB(getC());
		setA(getB());
		System.out.println(getA() + " " + getB() + " " + getC());
		System.out.println();
	}

	public void executarD() {
		setA(10);
		setB(getA() + 1);
		setA(getB() + 1);
		setB(getA() + 1);
		System.out.println(getA());
		setA(getB() + 1);
		System.out.println(getA() + " " + getB());
		System.out.println();
		
	}
	public void executarE() {
		setA(10);
		setB(5);
		setC(getA() + getB());
		setB(20);
		setA(10);
		System.out.println(getA() + " " + getB() + " " + getC());
		System.out.println();
	}
	public void executarF() {
		setX(1);
		setY(2);
		setZ(getY() - getX());
		System.out.println(getZ());
		setX(5);
		setY(getX() + getZ());
		System.out.println(getX() + " " + getY() + " " + getZ());
		System.out.println();
	}
}
