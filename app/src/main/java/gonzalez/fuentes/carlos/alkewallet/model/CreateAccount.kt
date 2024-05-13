package gonzalez.fuentes.carlos.alkewallet.model

data class CreateAccount(
    val amount: Long,
    val concept: String,
    val date: String,
    val type: String,
    val accountID: Long,
    val userID: Long,
    val toAccountID: Long
)
