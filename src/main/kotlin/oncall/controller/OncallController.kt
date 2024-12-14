package oncall.controller

import oncall.model.Oncall
import oncall.validation.InputValidator
import oncall.view.InputView

// Controller에서
class OncallController {
    fun run(){

        val input = InputView.getStartInfo()

        val (month, day) = Oncall.splitStartInto(input)


    }
}
