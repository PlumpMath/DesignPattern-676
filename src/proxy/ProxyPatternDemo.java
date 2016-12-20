package proxy;

/*
 * In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpb");

		// image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
}
