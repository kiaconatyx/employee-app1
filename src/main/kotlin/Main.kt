

fun main(args: Array<String>){
    println("Pay Slip Printer")
    printPayslip()
    println("\n")
    printPayslipWithRounding()
}

val firstName = "Joe"
val lastName = "Soap"
val gender = "m"
val employeeID = 6143
val grossSalaries = 67543.21
val payePercentage = 38.5
val prsiPercentage = 5.2
val annualBonus = 1450.50
val cycleToWorkSchemeMonthlyDeduction = 54.33



fun printPayslip(){

    val monthlySalary = (grossSalaries/12)
    val monthlyPrsi = monthlySalary * (prsiPercentage / 100)
    val monthlyPaye = monthlySalary * (payePercentage / 100)
    val grossPay = (monthlySalary + (annualBonus/12))
    val totalDeductions = (monthlyPrsi + monthlyPrsi + cycleToWorkSchemeMonthlyDeduction)

    println ("_________________________________________________________________________")
    println ("|                          Monthly Payslip                              |")
    println ("|_______________________________________________________________________|")
    println ("|                                                                       |")
    println ("|   Employee Name:  " + firstName.uppercase() + " " + lastName.uppercase() + "(" + gender.uppercase() + ")                    Employee ID: " + employeeID + "    |")
    println ("|                                                                       |")
    println ("|_______________________________________________________________________|")
    println ("|                                                                       |")
    println ("|    PAYMENT DETAILS \t\t\t\t DEDUCTION DETAILS  \t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Salary: " + monthlySalary + "\t\t PAYE: " + monthlyPaye + "\t\t\t|")
    println ("|    Bonus:  " + (annualBonus / 12) + "\t\t\t\t PRSI: " + monthlyPrsi  + "\t\t\t|")
    println ("|    \t\t\t\t\t\t\t\t Cycle To Work: " + cycleToWorkSchemeMonthlyDeduction  + "\t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Gross:  " + grossPay + " \t\tTotal Deductions: " + totalDeductions + " |")
    println ("|_______________________________________________________________________|")
    println ("|   \t\t\t\t NET PAY:" + (grossPay - totalDeductions) + " \t\t\t\t\t\t\t|")
    println ("|_______________________________________________________________________|")
}

fun printPayslipWithRounding(){

    val monthlySalary = (grossSalaries/12)
    val monthlyPrsi = monthlySalary * (prsiPercentage / 100)
    val monthlyPaye = monthlySalary * (payePercentage / 100)
    val grossPay = (monthlySalary + (annualBonus/12))
    val totalDeductions = (monthlyPrsi + monthlyPrsi + cycleToWorkSchemeMonthlyDeduction)

    println ("_________________________________________________________________________")
    println ("|                          Monthly Payslip                              |")
    println ("|_______________________________________________________________________|")
    println ("|                                                                       |")
    println ("|   Employee Name:  " + firstName.uppercase() + " " + lastName.uppercase() + "(" + gender.uppercase() + ")                    Employee ID: " + employeeID + "    |")
    println ("|                                                                       |")
    println ("|_______________________________________________________________________|")
    println ("|                                                                       |")
    println ("|    PAYMENT DETAILS \t\t\t\t DEDUCTION DETAILS  \t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Salary: " + "%.2f".format(monthlySalary) + "\t\t\t\t PAYE: " + "%.2f".format(monthlyPaye) + "\t\t\t\t\t\t|")
    println ("|    Bonus:  " + "%.2f".format((annualBonus / 12)) + "\t\t\t\t\t PRSI: " + "%.2f".format(monthlyPrsi)  + "\t\t\t\t\t\t|")
    println ("|    \t\t\t\t\t\t\t\t Cycle To Work: " + cycleToWorkSchemeMonthlyDeduction  + "\t\t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|    Gross:  " + "%.2f".format(grossPay) + " \t\t\t\tTotal Deductions: " + "%.2f".format(totalDeductions) + " \t\t\t|")
    println ("|_______________________________________________________________________|")
    println ("|   \t\t\t\t\t\t NET PAY:" + "%.2f".format((grossPay - totalDeductions)) + " \t\t\t\t\t\t\t|")
    println ("|_______________________________________________________________________|")
}