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

Rectangle rectangle2 = new Rectangle()

rectangle2.upLeft = new Point()
println "Please enter the value for x at point 1: "
rectangle2.upLeft.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 1: "
rectangle2.upLeft.y = Double.parseDouble(System.console().readLine())

rectangle2.downRight = new Point()
println "Please enter the value for x at point 2: "
rectangle2.downRight.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 2: "
rectangle2.downRight.y = Double.parseDouble(System.console().readLine())

Rectangle rectangle3 = new Rectangle()

rectangle3.upLeft = new Point()
println "Please enter the value for x at point 1: "
rectangle3.upLeft.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 1: "
rectangle3.upLeft.y = Double.parseDouble(System.console().readLine())

rectangle3.downRight = new Point()
println "Please enter the value for x at point 2: "
rectangle3.downRight.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 2: "
rectangle3.downRight.y = Double.parseDouble(System.console().readLine())

Point otherpoint = new Point()
println "Please enter the value for x at point 3: "
otherpoint.x = Double.parseDouble(System.console().readLine())
println "Please enter the value for y at point 3: "
otherpoint.y = Double.parseDouble(System.console().readLine())

if (isInside(rectangle1, otherpoint)) {
	if (isInside(rectangle2, otherpoint)) {
	println "The point falls inside both rectangles."
	} else {
		println "The point falls inside rectangle 1."
	}
} else if (isInside(rectangle2, otherpoint)) {
	println "The point falls inside rectangle 2."
	} else {
	println "The point falls outside both rectangles."
	}
