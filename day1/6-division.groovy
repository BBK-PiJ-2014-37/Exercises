println "Please key in a number"
String str1 = System.console().readLine()
int ddend = Integer.parseInt(str1)

println "Please key in another number"
String str2 = System.console().readLine()
int div = Integer.parseInt(str2)

int rest = ddend
int quotient = 0
while (rest >= div) {
	rest = rest - div
	quotient++
}
println ddend + " divided by " + div + " is " + quotient + ", remainder " + rest

