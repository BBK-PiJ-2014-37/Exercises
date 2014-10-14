double totalToBePaid(double cost, double rate){
	double t = cost * (1 + rate)
	return t	
}

double calculatePercenttoRate(double percent){
	rate = percent / 100
	return rate
}

double moneyperYear(double totalAmount, int numberofYears) {
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


double cost = getInput("cost")
int numberofYears = getInput("number of years to pay it back")
double ratepercent = getInput("rate")
double rate = calculatePercenttoRate(ratepercent)
double totalAmount = totalToBePaid( cost,  rate)
double totalInterest = totalInterest( cost,  rate)
double my = moneyperYear(totalAmount, numberofYears)
double ybip = yearsBeforeInterestPaid(totalInterest, my)
println "The total amount to be paid is " + totalToBePaid( cost,  rate)
println "The money to be paid every year is " + moneyperYear(totalAmount, numberofYears)
println "The number of years before the interest is paid is " + yearsBeforeInterestPaid(totalInterest, my)



