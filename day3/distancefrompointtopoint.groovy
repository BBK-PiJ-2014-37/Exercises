double getDistance(Point a, Point b) {
	int da = a.x - b.x;
	int db = a.y - b.y;
	double result = Math.sqrt((da * da) + (db * db));
	return result;
}


int getSmallest(double dist1, double dist2 , double dist3){
	if (dist1 <  dist2) {
    	if (dist3 < dist1) {
    		return dist3
    	} else {
    		return dist1
    	}
    } else if (dist2 < dist3) {
    	return dist2
    } else {
    	return dist3
    }

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

double dist1 = getDistance(point1, point2)
double dist2 = getDistance(point1, point3)
double dist3 = getDistance(point2, point3)
if (getSmallest (dist1, dist2, dist3) == dist1) {
	println "Point 1 and point 2 are closer, the distance is " + dist1
} else if (getSmallest (dist1, dist2, dist3) == dist2) {
	println "Point 1 and point 3 are closer, the distance is " + dist2
} else {
	println "Point 2 and point 3 are closer, the distance is " + dist3
}