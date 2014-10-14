int binary2decimal() {
	println "Please, enter a binary number"
    String str= System.console().readLine()
    List binary[] = getDigits(str)
    int i = binary.size - 1
    int decimal = 0
    while (i <= 0) {
    	decimal = decimal + binary[i] * (2 ^ i)
    	i--
    }
    return decimal

}

List getDigits(String s) { 
    List digits = []
    int i = 0
    while (i < s.size()) {
        digits << s[i]
        i = i + 1
    }
return digits
}

printl binary2decimal(01110)