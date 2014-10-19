int n
while (true) {
	println "Please key a number from 1 to 9: "
	String s = System.console().readLine()
	n = Integer.parseInt(s)
	if (n > 0 && n < 10) {
		break
	} else {
		println "That number is no good"
	}
}

int c = 1
while (c <= n) {
    int i = 1
    while (i <= c) { 
        print c
		i++
	} 
    c++
    println ""
}


