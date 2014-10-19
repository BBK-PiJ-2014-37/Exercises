boolean fin = false
while (!fin) {
  print "Enter a string: "
  String s = System.console().readLine()
  fin = s == ""
  if (!fin) {
    int i = 0
    int j = s.length()-1
    boolean isPalindrome = true
    while (isPalindrome && i < s.length()/2) {
      if (s[i] != s[j]) {
        println "Nope!"
        isPalindrome = false
      }
      i++
      j--
    }
    if (isPalindrome) {
        println "Yes!!!!"
    }
  }
}