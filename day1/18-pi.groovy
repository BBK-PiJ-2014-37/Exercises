println "Please, key in a number"
String s = System.console().readLine()
int n = Integer.parseInt(s)
double pi = 0 
int k = 0
while (k <= n) {
  	if ((k % 2) == 0) {
    	pi = pi + (1/(2 * k + 1))
  	} else {
    	pi = pi + (-1/(2 * k + 1))
  	}
  	k++
}
println pi * 4
