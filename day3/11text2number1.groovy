double getDoubleFromText(String s){
	int i = 0
	String numb = ""
	char c
	int power = 0
	while (i < s.size()) {
		c = s.charAt(i)
		if (c.isDigit()) {
			numb = numb + c
		} else if (c == "."){
			String dec = s.substring(i+1)
			power = dec.size()
		}
		i++
	}
	int num = Integer.parseInt(numb)
	double decimal = num / (10 ** power)
	return decimal
}

println getDoubleFromText("23,4614")