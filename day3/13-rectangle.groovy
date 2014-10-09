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

int area = (Math.abs(upLeft.x - downRight.x) * Math.abs(upLeft.y - downRight.y))
int perimeter = (Math.abs(upLeft.x - downRight.x) + Math.abs(upLeft.y - downRight.y)) * 2 
println "Area: " + area
println "Perimeter: " + perimeter