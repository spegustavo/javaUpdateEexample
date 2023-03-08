package version.fourteen.instanceOfPattern;

public class InstanceOfPattern {

	public static void main(String[] args) {

	}

	public static double getPerimeter(Shape shape) throws IllegalArgumentException {
		if (shape instanceof Rectangle) {
			Rectangle s = (Rectangle) shape;
			return 2 * s.length() + 2 * s.width();
		} else if (shape instanceof Circle) {
			Circle s = (Circle) shape;
			return 2 * s.radius() * Math.PI;
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}
	}

	/**
	 * Removing this conversion step also makes your code safer. Testing an object's
	 * type with the instanceof, then assigning that object to a new variable with a
	 * cast can introduce coding errors in your application. You might change the
	 * type of one of the objects (either the tested object or the new variable) and
	 * accidentally forget to change the type of the other object.
	 */

	public static double getPerimeterPattern(Shape shape) throws IllegalArgumentException {
		if (shape instanceof Rectangle s) {
			return 2 * s.length() + 2 * s.width();
		} else if (shape instanceof Circle s) {
			return 2 * s.radius() * Math.PI;
		} else {
			throw new IllegalArgumentException("Unrecognized shape");
		}
	}
}
