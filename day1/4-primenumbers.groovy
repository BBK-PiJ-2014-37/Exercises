String str = System.console().readLine()
int i = Integer.parseInt(str)
int d = Math.sqrt(i)
boolean prime = true
while (prime && d > 1) {
	if (i % d == 0) {
		prime = false
	} else {
		d--
	}
}
if (prime) {
    println i + " is a prime number" 
} else {
    println i + " is not a prime number"
}
