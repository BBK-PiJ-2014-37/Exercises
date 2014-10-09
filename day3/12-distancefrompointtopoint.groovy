//Define a method for distance
double distance22(Point a, Point b) {
	int da = a.x - b.x;
	int db = a.y - b.y;
	double result = Math.sqrt((da * da) + (db * db));
	return result;
}


int naivesmallest(int num1, int num2, int num3) {
	int t
	if (num1 <  num2) {
    	t = num2
    	num2 = num1
    	num1 = t
    	if (num2 < num3) {
        	t = num2
        	num2 = num3
        	num3 = t
        	// num3 contains the largest number.
    	}
	}
	return num3
}


class Point {
	double x
	double y
}

Point point1 = new Point()
println "Please enter the value for x at point 1: "
String strx1 = System.console().readLine()
point1.x = Double.parseDouble(strx1)
println "Please enter the value for y at point 1: "
String stry1 = System.console().readLine()
point1.y = Double.parseDouble(stry1)
Point point2 = new Point()
println "Please enter the value for x at point 2: "
String strx2 = System.console().readLine()
point2.x = Double.parseDouble(strx2)
println "Please enter the value for y at point 2: "
String stry2 = System.console().readLine()
point2.y = Double.parseDouble(stry2)
Point point3 = new Point()
println "Please enter the value for x at point 3: "
String strx3 = System.console().readLine()
point3.x = Double.parseDouble(strx3)
println "Please enter the value for y at point 1: "
String stry3 = System.console().readLine()
point3.y = Double.parseDouble(stry3)

int	da = point1.x - point2.x;
int	db = point1.y - point2.y;
double dist = Math.sqrt ((da * da) + (db * db));

println (distance22(point1,point2));