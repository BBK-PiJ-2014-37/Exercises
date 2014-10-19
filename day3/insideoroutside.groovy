class Point {
	double x
	double y
}
class Rectangle {
	Point upLeft
	Point downRight
}

boolean isInside(Rectangle rect, Point a){
	if ((a.x < rect.downRight.x) && (a.x > rect.upLeft.x) && (a.y < rect.upLeft.y) && (a.y > rect.downRight.y)) {
		return true
	} else {
		return false
	}
}

Rectangle rectangle1 = new Rectangle()
rectangle1.upLeft = new Point()
println "Please enter the value for x at point 1: "
rectangle1.upLeft.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 1: "
rectangle1.upLeft.y = Double.parseDouble(System.console().readLine())

rectangle1.downRight = new Point()
println "Please enter the value for x at point 2: "
rectangle1.downRight.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 2: "
rectangle1.downRight.y = Double.parseDouble(System.console().readLine())

Point otherpoint = new Point()
println "Please enter the value for x at point 3: "
otherpoint.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 3: "
otherpoint.y = Double.parseDouble(System.console().readLine())

if (isInside(rectangle1, otherpoint)) {
	println "The point falls inside the rectangle"
} else {
	println "The point falls outside the rectangle"
}