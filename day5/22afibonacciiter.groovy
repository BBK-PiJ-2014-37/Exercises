int fib(int n) {
        if (n < 2) {
                return 1
        } else {
                int fi_1 = 1
                int fi_2 = 1
                int fi = 0
                int i = 2
                while (i <= n) {
                        fi = fi_1 + fi_2
                        fi_2 = fi_1
                        fi_1 = fi
                        i = i + 1
                }
                return fi
        } 
}

println fib(1)
println fib(2)
println fib(3)
println fib(4)
println fib(5)
println fib(6)
println fib(7)
println fib(8)

