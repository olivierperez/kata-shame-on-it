interface Screen
class MainScreen : Screen
class AccountsScreen : Screen

class Accounts {
    fun getAllAccountsList(calback: Accounts.GetAccountsCalback<AccountListObject>) {

    }

    interface GetAccountsCalback<T> {
        fun onSuccess(result: List<AccountListObject>)
        fun onFailure(error: Throwable)
    }

    companion object {
        fun getInstance(): Accounts = TODO("Not important for exercise")
    }
}

class AccountListObject {
    fun isAlreadyDiscovered(): Boolean = TODO("Not important for exercise")
}

class IconBlock {
    fun setNotification(title: String, index: Int) {
    }
}
