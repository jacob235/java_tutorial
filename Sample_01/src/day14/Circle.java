package day14;


abstract class Shape1 implements DrawableAndMoveable{		// abstract는 틀을 잡아준다.(기반을 잡아준다)
	abstract double area();		// 같은 코드를 만들어 줄 수 있도록 해준다.
}


interface Drawable{		// 자바에서는 클래스 뒤에 able가 붙어있으면 다 인터페이스다
	void draw();		// public abstract 가 생략되어있다. 인터페이스는 무조건 public과 abstract만 허용하기 때문
}

interface Moveable{
	void move(int m);
}


interface DrawableAndMoveable extends Drawable, Moveable{
//	void draw();
//	void move(int n);
}

public class Circle extends Shape1 implements Cloneable{ //원의 면적을 구해서 리턴시켜줄수 있는 메소드 완성시켜라
	// extends 는 상속의 의미가 강하고, implements는 구현의 의미가 강하다.
	public Point p;		// 두개의 클래스를 상속 받을수 없다. 가장 중요한 클래스를 상속 받고 나머지는 has a 관계로 해야한다.
	public double r;
	
	@Override
	double area() {
		return r*r*Math.PI;
	}
	
	
	public Circle() {
		super();
	}


	public Circle(Point p, double r) {
		super();
		this.p = p;
		this.r = r;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}


	public Point getP() {
		return p;
	}


	public void setP(Point p) {
		this.p = p;
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName()+" 그리기");
		
	}
	
	@Override
	public void move(int m) {
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
	}
	
//	@Override
//	public Circle clone() throws CloneNotSupportedException {
//		Circle c = (Circle)super.clone();
//		this.p = (Point)p.clone();
//		return c;
//	}
	@Override
	public Circle clone() throws CloneNotSupportedException {
		Circle c = (Circle)super.clone();
		Point p = c.p.clone();
		c.p = p;
		return c;
	}
	
//	@Override
//	public Circle clone() throws CloneNotSupportedException{
//		return (Circle) super.clone();
//	}
	
}
