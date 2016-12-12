package prototype;

public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.print("Shape: " + clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.print("Shape: " + clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.print("Shape: " + clonedShape3.getType());
	}

}
