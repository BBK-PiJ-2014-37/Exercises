int binary2decimal(String str) {
    int i = str.size()-1
    int d = 0
    int n = 0
    char digit
    while (i >= 0 ) {
        if (str.charAt(i) == "0") {
            d = 0
        } else {
            d = 1
        }
        n = n * 2 + d
        i--
    }
    return n
}


println binary2decimal("1")
println binary2decimal("1001")
println binary2decimal("1001001")



