package Pack6;

import Pack6.subpack1.CCircle;
import Pack6.subpack2.CRectangle;
import Pack6.subpack1.subsubpack.CStyle;

public class Class08 {
	public static void main(String args[]) {
		CCircle cir = new CCircle();
		CRectangle rect = new CRectangle();
		CStyle sty = new CStyle(1);
		cir.show();
		rect.show();
	}
}