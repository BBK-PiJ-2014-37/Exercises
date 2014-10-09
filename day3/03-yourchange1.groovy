println "Enter the cost of the purchase"
String spurchase = System.console().readLine()
double purchase = Double.parseDouble(spurchase)
println "Enter the amount of money paid"
String smoneyPaid = System.console().readLine()
double moneyPaid = Double.parseDouble(smoneyPaid)
double change = moneyPaid - purchase
println "Your change is: " + change
int fifty = Math.floor(change / 50)
change = change - (fifty * 50)
int twenty = Math.floor(change / 20)
change = change - (twenty * 20)
int ten =  Math.floor(change / 10)
change = change - (ten * 10)
int five = Math.floor(change / 5)
change = change - (five * 5)	
int two = Math.floor(change / 2)
change = change - (two * 2)
int one = Math.floor(change / 1) 
change = change - (one * 1)
double fiftyp = Math.floor(change / 0.5)
change = change - (fiftyp * 0.5)
double twentyp = Math.floor(change / 0.2) 
change = change - (twentyp * 0.2)
double tenp = Math.floor(change / 0.1)
change = change - (tenp * 0.1)
double fivep = Math.floor(change / 0.05) 
change = change - (fivep * 0.05)
double twop = Math.floor(change / 0.02) 
change = change - (twop * 0.02)
double onep = Math.floor(change / 0.01)
change = change - (onep * 0.01)

println "Here is your change: "
println fifty + " notes of £50"
println twenty + " notes of £20"
println ten + " notes of £10"
println five + " notes of £5"
println two + " coins of £2"
println one + " coins of £1"
println fiftyp + " coins of £ 0.5"
println twentyp + " coins of £ 0.2"
println tenp + " coins of £ 0.1"
println fivep + " coins of £ 0.5"
println twop + " coins of £ 0.2"
println onep + " coins of £ 0.1"