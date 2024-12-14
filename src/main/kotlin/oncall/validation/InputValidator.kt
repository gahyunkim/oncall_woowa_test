package oncall.validation

object InputValidator {
    fun validateStartInfo(input: String){
        if(input.isEmpty()) throw IllegalArgumentException("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.")

        if(!input.contains(",")) throw IllegalArgumentException("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.")
    }

}