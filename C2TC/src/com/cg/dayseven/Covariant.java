package com.cg.dayseven;

public class Covariant {

}
class Color{
	protected Color getColor() {
		Color c=new Color();
		return c;
	}
}
class Green extends Color{
	protected Color getColor() {
		Green g=new Green();
		return g;
	}
}
