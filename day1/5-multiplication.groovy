println "Please key in a number"
String str1 = System.console().readLine()
int num1 = Integer.parseInt(str1)
println "Please key in another number"
String str2 = System.console().readLine()
int num2 = Integer.parseInt(str2)
int re = 0
while (num2 > 0) {
	re += num1
	num2--
}
println re
	




