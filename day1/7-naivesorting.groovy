String str1 = System.console().readLine()
int num1 = Integer.parseInt(str1)
String str2 = System.console().readLine()
int num2 = Integer.parseInt(str2)
String str3 = System.console().readLine()
int num3 = Integer.parseInt(str3)
int t
if (num1 >  num2) {
        t = num2
        num2 = num1
        num1 = t
        if (num2 > num3) {
                t = num2
                num2 = num3
                num3 = t
        // num3 contains the largest number.
                if (num1 > num2) {
                        t = num1
                        num1 = num2
                        num2 = t
                }
        }
}
println(num1 + ", " + num2 + ", " + num3);
