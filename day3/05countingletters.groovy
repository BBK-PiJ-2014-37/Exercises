 print "Enter a string: "
 String s = System.console().readLine()
 int j = 0
 int l = s.length()
 int count = 0
 char letter= "e"

 while (j < l) {
 	if (s[j] == letter) {
 		count++ 		
 	}
 	j++
 }
 println "There are "+ count + " letters \"" + letter + "\" in this text."
