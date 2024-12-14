package oncall.model

import oncall.validation.InputValidator
import oncall.view.InputView

object Oncall {
//    fun splitStartInfo(input: String):Pair<Int, String>{
//        val (monthString,day)= input.split(",").map {it.trim()}
//
//        val month = monthString.toInt()
//        return Pair(month, day)
//    }

    fun splitStartInto(input: String): Pair<Int, String> {
        val parts = input.split(",").map { it.trim() }

        // 입력 값 검증
        if (parts.size != 2) {
            throw IllegalArgumentException("[ERROR] 입력 값은 '월,요일' 형식이어야 합니다.")
        }

        val month = parts[0].toIntOrNull() ?: throw IllegalArgumentException("[ERROR] 월은 숫자여야 합니다.")
        val day = parts[1]

        // 요일 검증
        val validDays = setOf("월", "화", "수", "목", "금")
        if (day !in validDays) {
            throw IllegalArgumentException("[ERROR] 요일은 월, 화, 수, 목, 금 중 하나여야 합니다.")
        }

        return Pair(month, day)
    }
}