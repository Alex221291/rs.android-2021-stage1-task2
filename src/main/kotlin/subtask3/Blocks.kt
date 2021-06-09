package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            (Int::class) -> {
                var sum = 0
                    for(i in 0 until blockA.size) {
                       if (blockA[i] is Int) sum += blockA[i].toString().toInt()
                    }
                return sum
            }
            (String::class) -> {
                var str = ""
                for(i in 0 until blockA.size) {
                    if (blockA[i] is String) str ="$str${blockA[i]}"
                }
                return str
            }
            (LocalDate::class) -> {
                val date = blockA.filterIsInstance<LocalDate>().max()!!.format(
                    DateTimeFormatter.ofPattern(
                        "dd.MM.y"
                    )
                )
                return date
            }
            else -> return 0
        }
    }
}

