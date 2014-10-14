int binary2decimal(String str) {
    int i = str.size()
    int decimal = 0
    int binary = 0
    char digit
    while (i > 0 ) {
        digit = str.charAt(str.size() - i)
        binary= Integer.parseInt(new String(digit))
        decimal = decimal + binary * (2 ** i)
        println ("i:" + i + "  binary:" + binary + "   2**i:" + (2 ** i))
        i--
    }
    return decimal

}

int binary2decimalBis(String str) {
    int i = 0
    int decimal = 0
    int binary = 0
    char digit
    while (i < str.size()) {
        digit = str.charAt(i)
        binary= Integer.parseInt(new String(digit))
        decimal = decimal + binary * (2 ** (str.size() - i))
        println ("i:" + i + "  binary:" + binary + "   2**i:" + (2 ** i))
        i++
    }
    return decimal

}
// This one I have no clue
int decimal2binary(int decimal) {
    int i = int.size()
    int decimal = 0
    int binary = 0
    while (i > 0 ) {
        binary = binary + binary / (2 ** i)
        println ("i:" + i + "  binary:" + binary + "   2**i:" + (2 ** i))
        i--
    }
    return decimal


}
println binary2decimal("0")
println binary2decimal("1")
println binary2decimal("001")
println binary2decimal("01")
println binary2decimal("001001")
println binary2decimalBis("001001")
