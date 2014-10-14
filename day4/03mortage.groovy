double totalToBePaid(double cost, double rate){
	double t = cost * (1 + rate)
	return t	
}

double calculatePercenttoRate(double percent){
	rate = percent / 100
	return rate
}

double moneyperYear(double totalAmount, double numberofYears) {
	my = totalAmount / numberofYears
	return my	
}

double totalInterest(double cost, double rate) {
	double ti = cost * rate
	return ti
}

double yearsBeforeInterestPaid(double totalInterest, double my) {
	double ybip = totalInterest / my
	return ybip
}

double getInput(String s) { 
    println "Please, enter the " + s + " of your mortage"
    String str= System.console().readLine()
    double i = Double.parseDouble(str)
    return i 
}


Mortage mortage1 = new Mortage()
mortage1.cost = getInput("cost")
mortage1.numberofYears = getInput("number of years to pay it back")
double ratepercent = getInput("rate")
mortage1.rate = calculatePercenttoRate(ratepercent)
double totalAmount = totalToBePaid(mortage1.cost, mortage1.rate)
double totalInterest = totalInterest(mortage1.cost, mortage1.rate)
double my = moneyperYear(totalAmount, numberofYears)
double ybip = yearsBeforeInterestPaid(totalInterest, my)
println "The total amount to be paid is " + totalToBePaid(mortage1.cost, mortage1.rate)
println "The money to be paid every year is " + moneyperYear(totalAmount, numberofYears)
println "The number of years before the interest is paid is " + yearsBeforeInterestPaid(totalInterest, my)
