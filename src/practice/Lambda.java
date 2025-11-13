package practice;
@FunctionalInterface
interface Shape{
	 void draw();
}
//class Rectangle implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("rectangle class :draw() method");
//		
//	}
//	
//}
//class Square implements Shape{
//
//	@Override
//	public void draw() {
//		System.out.println("square class :draw() method");
//		
//	}
//	
//}
public class Lambda {
	
public static void main(String[] args) {
	///Shape  rectangle=()->System.out.println("rectangle class : draw() method");
//	rectangle.draw();
	///Shape square=()->System.out.println("square class :draw() method");
//	square.draw();
	///Shape circle=()->System.out.println("circle class : draw ()method");
//	circle.draw();
	
//	print(rectangle);
//	print(square);
//	print(circle);
	print(()->System.out.println("rectangle class : draw() method"));
	print(()->System.out.println("square class :draw() method"));
	print(()->System.out.println("circle class : draw ()method"));
}
public static void print(Shape imple) {
	imple.draw();
}
}
