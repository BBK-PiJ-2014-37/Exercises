//It doesn't work with doubles, Can Groovy take doubles from Strings??
println "Please enter a number: "
String str1 = System.console().readLine()
double num1 = parseInt(str1)
println "Please enter a number: "
String str2 = System.console().readLine()
double num2 = Double.parseDouble(str2)
double result
println "Please, choose an operation: +, -, *, / "
String operation= System.console().readLine()
switch (operation) {
    case "+":
    result = num1 + num2    		
    break
    case "-":
    result = num1 - num2    		
    break
    case "*":
    result = num1 * num2    		
    break
    case "/":
    result = num1 / num2    		
    break
}
println num1 + " "+ operation + " " + num2 + "= " + result
