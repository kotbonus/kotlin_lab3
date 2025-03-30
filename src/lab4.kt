fun main() {
    println("Введите число от 1 до 7, соответствующее дню недели:")
    val dayNumber = readLine()?.toIntOrNull()
    when (dayNumber) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Некорректный ввод. Пожалуйста, введите число от 1 до 7.")
    }
}
