fun main() {
    println("Введите первое число:")
    val number1 = readLine()?.toIntOrNull()
    println("Введите второе число:")
    val number2 = readLine()?.toIntOrNull()

    if (number1 != null && number2 != null) {
        val areBothEven = if (number1 % 2 == 0 && number2 % 2 == 0) true else false
        println("Обе переменные четные: $areBothEven")
    } else {
        println("Пожалуйста, введите корректные целые числа.")
    }
}
