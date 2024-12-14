package oncall.view

import camp.nextstep.edu.missionutils.Console
import oncall.validation.InputValidator

object InputView {
    fun getStartInfo(): String {
        while(true){
            try {
                println("비상 근무를 배정할 월과 시작 요일을 입력하세요>")
                val input = Console.readLine()
                InputValidator.validateStartInfo(input)

                return input
            }
            catch (e: IllegalArgumentException){
                // 에러 메시지를 그대로 출력
                println(e.message)
            }
        }
    }

}