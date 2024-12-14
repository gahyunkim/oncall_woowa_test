package oncall

import oncall.controller.OncallController

fun main() {
    // main은 프로그램의 시작점으로서 간결하고 명확해야 합니다.
    val controller = OncallController()
    controller.run()
}
