boolean finished = false
int max = 0
while (!finished) {
	println "Please enter a number (end with -1): "
	String s = System.console().readLine()
	int num = Integer.parseInt(s)
	if (num == -1) {
		finished = true
	} else if (num > max) {
	        max = num
	        }
		
	}
println "The highest number is " + max
