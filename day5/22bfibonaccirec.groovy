int fibonacci(int n) {
	int f = 0;
	if (n == 1 || n == 2) {
		return 1
	} else {
		f = fibonacci(n-1) + fibonacci(n-2)
	}
	return f
}

println fibonacci(1)
println fibonacci(2)
println fibonacci(3)
println fibonacci(4)
println fibonacci(5)
println fibonacci(6)
