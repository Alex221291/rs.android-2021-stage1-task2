
package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val template = DateTimeFormatter
                .ofPattern("dd MMMM, EEEE")
                .withLocale(Locale.forLanguageTag("Ru"))
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(template)
        } catch (exc: DateTimeException) {
            "Такого дня не существует"
        }
    }
}