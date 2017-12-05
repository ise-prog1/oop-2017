import de.tub.ise.graphics.Painter;

public class PilzDemo {

	public static void main(String[] args) {
//		Painter.show();
//		
//		for(int y = 0; y < Painter.shroom.length; y++) {
//			for(int x = 0; x < Painter.shroom[y].length; x++) {
//				Painter.paint(x, y, Painter.shroom[y][x]);
//			}
//		}
		long x = 999_999_999_9L;
		int i = 0;
		double d = 0.0;
		double f = 0.0f;
		short s = 0;
		byte b = 0;
		long l = 0L;
		char c = '\0';
		
		print(b);
		print(s);
		print(i);
		print(c);
		
		print(f);
		print(d);
		print(l);
		
	}
	
	public static void print(int x) {
		System.out.println("int");
	}
	
	public static void print(double d) {
		System.out.println("double");
	}
}
