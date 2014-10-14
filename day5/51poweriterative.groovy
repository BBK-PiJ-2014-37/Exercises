int pow(int base, int exp) {
	int i = 1
	int result = 1
	if (exp == 0){
		return 1
	} else {
		while (i <= exp) {
		result = result * base
		i++
		}
	}
return result
}
println pow(2,2)
println pow(2,3)
println pow(2,1)
println pow(2,0)
println pow(5,4)


