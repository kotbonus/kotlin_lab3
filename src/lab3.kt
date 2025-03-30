fun main() {
    val number1 = 2
    val number2 = 6

    println("У вас есть числа: $number1 и $number2")
    println("Выберите действие:")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> {
            val result = number1 + number2
            println("Результат добавления: $result")
        }
        2 -> {
            val result = number2 - number1
            println("Результат отнимания: $result")
        }
        0 -> {
            println("Вы выбрали ничего.")
        }
        else -> {
            println("Некорректный ввод. Пожалуйста, введите 0, 1 или 2.")
        }
    }
}
