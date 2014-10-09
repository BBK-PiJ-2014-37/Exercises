print "Enter a string: "
String s = System.console().readLine()
int l = s.size()
int j = l - 1
while (j >= 0) {
  s = s + s[j]
  j--
}
println s
