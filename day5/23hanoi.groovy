long hanoi(long n) {
  long result = 0
  if (n == 1) {
    result = 1
  } else {
    result = 2 * hanoi(n-1) + 1
  }
  return result
}
println hanoi(2)
println hanoi(3)
println hanoi(4)
println hanoi(64)
  
 9223372036854775807
18446744073709551615