class Point {
	double x
	double y
}
class Rectangle {
	Point upLeft
	Point downRight
}

Point upLeft = new Point()
println "Please enter the value for x at point 1: "
String strx1 = System.console().readLine()
upLeft.x = Double.parseDouble(strx1)
println "Please enter the value for y at point 1: "
String stry1 = System.console().readLine()
upLeft.y = Double.parseDouble(stry1)
Point downRight = new Point()
println "Please enter the value for x at point 2: "
String strx2 = System.console().readLine()
downRight.x = Double.parseDouble(strx2)
println "Please enter the value for y at point 2: "
String stry2 = System.console().readLine()
downRight.y = Double.parseDouble(stry2)

Point otherpoint = new Point()
println "Please enter the value for x at point 3: "
String strx3 = System.console().readLine()
otherpoint.x = Double.parseDouble(strx3)
println "Please enter the value for y at point 3: "
String stry3 = System.console().readLine()
otherpoint.y = Double.parseDouble(stry3)

if ((otherpoint.x < downRight.x) && (otherpoint.x > upLeft.x) && (otherpoint.y < upLeft.y) && (otherpoint.y > downRight.y)) {
	println "The point falls inside the rectangle"
} else {
	println "The point falls outside the rectangle"
}