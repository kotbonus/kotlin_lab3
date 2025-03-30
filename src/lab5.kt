fun main() {
    println("Введите первое число:")
    val number1 = readLine()?.toDoubleOrNull()
    println("Введите второе число:")
    val number2 = readLine()?.toDoubleOrNull()
    println("Введите третье число:")
    val number3 = readLine()?.toDoubleOrNull()

    if (number1 == null || number2 == null || number3 == null) {
        println("Пожалуйста, введите корректные числа.")
        return
    }

    if (number1 == number2 && number2 == number3) {
        println("Ошибка")
        return
    }

    //мин
    val min = minOf(number1, number2, number3)

    //ср знач
    val average = (number1 + number2 + number3 - min - maxOf(number1, number2, number3)) / 1

    println("Среднее число: $average")
}
