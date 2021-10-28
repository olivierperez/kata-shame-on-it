package fr.o80.kata.snippet4.lib

class Accounts {
    fun getAllAccountsList(calback: GetAccountsCalback<AccountListObject>) {

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
