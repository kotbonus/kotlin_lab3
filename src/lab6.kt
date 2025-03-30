fun main() {
    println("Введите значение экспорта:")
    val export = readLine()?.toDoubleOrNull()
    println("Введите значение импорта:")
    val import = readLine()?.toDoubleOrNull()

    if (export == null || import == null) {
        println("Пожалуйста, введите корректные числовые значения.")
        return
    }

    val balance = export - import

    when {
        balance > 0 -> {
            println("Ваши прибыли составили: $balance")
        }
        balance < 0 -> {
            val losses = -balance
            println("Ваши убытки составили: $losses")
        }
        else -> {
            println("Сальдо ноль. У вас ни прибыли, ни убытков.")
        }
    }
}
