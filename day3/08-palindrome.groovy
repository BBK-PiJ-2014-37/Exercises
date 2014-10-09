boolean fin = false
while (!fin) {
  print "Enter a string: "
  String s = System.console().readLine()
  fin = s == ""
  if (!fin) {
    int j = 0
    int l = s.size()
    boolean maybe = true
    while (maybe && j < l/2) {
      if (s[j] != s[l-j]) {
        println "Nope!"
        maybe = false
      }
      if (maybe) {
        println "Yes!!!!"
      }
      j = j + 1
    }
  }
}