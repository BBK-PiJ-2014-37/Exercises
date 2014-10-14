void add1000(int number) {
	println "Starting a method, parameter is " + number
	number = number + 500
	println " In the middle of metod, parameter is " + number
	number = number + 500
	println " Ending method, parameter is " + number
}
int myNumber = 0
println " Starting program, my number is " + myNumber
add1000(myNumber)
println "After a method is used, my number is " + myNumber