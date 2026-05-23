class Calculator {
    var totalCalculations = 0
    var calcList: ArrayList<String> = arrayListOf()
    var currentTotal: Double? = null
    fun calculate(num1: Double, num2: Double, operator: String): Double {
        totalCalculations++
        var result = 0.0
        when (operator) {
            "+" -> {
                result = num1 + num2
            }
            "-" -> {
                result =  num1 - num2
            }
            "*" -> {
                result =  num1 * num2
            }
            "/" -> {
                result =  num1 / num2
            }
        }
        calcList.add("$num1 $operator $num2 = $result")
        currentTotal = result
        return result
    }

    fun clearHistory(){
        calcList.clear()
        totalCalculations = 0
        currentTotal = null
    }
}