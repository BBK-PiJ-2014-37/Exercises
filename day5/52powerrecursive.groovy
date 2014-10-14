int pow(int base, int exp) {
	int result = 1
	if (exp == 0){
		return 1
	} else if (exp == 1){
		result = 1 * base	
	} else {
		result = base * pow(base, exp-1)
	}
return result
}

println pow(2,2)
println pow(2,3)
println pow(2,1)
println pow(2,0)
println pow(5,4)
//I don't see a hugh difference between the two methods (iterative and recursive). 
//Maybe recursive method is easier since it's closer to the the mathematical definition.
//In both solution I needed to distinguish the cases exp == o and exp == 1