// Do I need to change the upleft to upLeft1? Are these variables, fields, methods????
	double x
	double y
}
class Rectangle {
	Point upLeft
	Point downRight
}
Rectangle rectangle1 = new Rectangle()
rectangle1.upLeft = new Point()
println "Please enter the value for x at upLeft point, for rectangle 1: "
String strx1 = System.console().readLine()
upLeft1.x = Double.parseDouble(strx1)
println "Please enter the value for y at upLeft point, for rectangle 1: "
String stry1 = System.console().readLine()
upLeft1.y = Double.parseDouble(stry1)
rectangle1.downRight = new Point()
println "Please enter the value for x at downRight point, for rectangle 1: "
String strx2 = System.console().readLine()
downRight1.x = Double.parseDouble(strx2)
println "Please enter the value for y at downRight point, for rectangle 1: "
String stry2 = System.console().readLine()
downRight1.y = Double.parseDouble(stry2)

Rectangle rectangle2 = new Rectangle()
rectangle2.upLeft = new Point()
println "Please enter the value for x at upLeft point, for rectangle 2: "
String strx3 = System.console().readLine()
upLeft2.x = Double.parseDouble(strx3)
println "Please enter the value for y at upLeft point, for rectangle 2: "
String stry3 = System.console().readLine()
upLeft2.y = Double.parseDouble(stry3)
rectangle1.downRight = new Point()
println "Please enter the value for x at downRight point, for rectangle 2: "
String strx4 = System.console().readLine()
downRight2.x = Double.parseDouble(strx4)
println "Please enter the value for y at downRight point, for rectangle 2: "
String stry4 = System.console().readLine()
downRight2.y = Double.parseDouble(stry4)

Point otherpoint = new Point()
println "Please enter the value for x at point 3: "
String strx5 = System.console().readLine()
otherpoint.x = Double.parseDouble(strx5)
println "Please enter the value for y at point 3: "
String stry5 = System.console().readLine()
otherpoint.y = Double.parseDouble(stry5)

if ((otherpoint.x < downRight1.x) && (otherpoint.x > upLeft1.x) && (otherpoint.y < upLeft1.y) && (otherpoint.y > downRight1.y)) {
	println "The point falls inside the rectangle 1"
} else {
	println "The point falls outside the rectangle"
}