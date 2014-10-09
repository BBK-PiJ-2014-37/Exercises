print "Enter a string: "
String s = System.console().readLine()
int l = s.length()
int j = 0
while (j < l) {
	if (s[j] == " ") {
 	println s.substring(0,j)
 	s = s.substring(j+1, )
 	j = 0
 	l = s.length()
 	}
 	j++
}
println s