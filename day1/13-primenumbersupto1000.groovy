int n = 2
int d 
boolean prime
while (n < 1000) {
	//non prime number have at least one factor that are less or equal than their square root.
	d = Math.sqrt(n)
	prime = true
    while (prime && d > 1) {
	    if (n % d == 0){
	        prime = false
	        break
	    } else {
		    d--
		}
	}
	if (prime) {
	    println n
	}
	n++
}

