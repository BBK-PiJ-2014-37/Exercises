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

int decimal2binary(String str) {
    int i = str.length()
    int d = 0
    int ndecimal = 0
    while (i >= 0) {
        switch (str.charAt(i)) {
            case "0":
                d = 0
                break
            case "1":
                d = 1
                break
            case "2":
                d = 2
                break
            case "3":
                d = 3
                break
            case "4":
                d = 4
                break
            case "5":
                d = 5
                break
            case "6":
                d = 6
                break
            case "7":
                d = 7
                break
            case "8":
                d = 8
                break
            case "9":
                d = 9
                break
        }
        ndecimal = ndecimal * 10 + d
        i--
    }
    return 
}



println binary2decimal("1")
println binary2decimal("1001")
println binary2decimal("1001001")

println decimal2binary("73")
println decimal2binary("9")
println decimal2binary("4")





