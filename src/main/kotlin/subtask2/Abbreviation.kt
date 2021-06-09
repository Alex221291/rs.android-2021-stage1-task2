package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {

        var pattern = "${b[0]}"
        for (i in 1 until  b.length)
        {
            pattern = "$pattern.*?${b[i]}"
        }

        return if (Regex(pattern).containsMatchIn(a.toUpperCase())) "YES" else "NO"
    }
}
