// print "Yes" if input number are monotonously increasing or decreasing and consecutive.
boolean finished = false
boolean goingUp = true
boolean goingDown = true
println "Please enter a number (end with -1): "
String s = System.console().readLine()
int prev = Integer.parseInt(s)
if (prev == -1) {
	finished = true
}
while (!finished) {
	println "Please enter another number (end with -1): "
	s = System.console().readLine()
	int num = Integer.parseInt(s)
	if (num == -1) {
		finished = true
	} else if (num == prev + 1) {
	    prev = num
	} else {
	    goingUp = false
	    if (num == prev - 1) {
	    	prev = num
		} else {
			goingDown = false
		}
	}
}
if (goingUp || goingDown) {
    println "Yes" 
} else {
    println "No"
}
