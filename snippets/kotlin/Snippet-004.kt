// Some help in "lib/Lib-004.kt"

class View(
    private val parentView: Screen
) {
    private lateinit var iconsBlock: IconBlock

    fun refreshIconNotification() {
        // TODO funny thing to do just for displaying a badge
        if (parentView is MainScreen || parentView is AccountsScreen) {
            iconsBlock.setNotification("", 4)
        } else {
            Accounts.getInstance().getAllAccountsList(object : Accounts.GetAccountsCalback<AccountListObject> {
                override fun onSuccess(result: List<AccountListObject>) {
                    for (accountList in result) {
                        if (!accountList.isAlreadyDiscovered()) {
                            iconsBlock.setNotification(" ", 4);
                            return;
                        }
                    }
                    iconsBlock.setNotification("", 4); // Reinit
                }

                override fun onFailure(error: Throwable) {
                    // Nothing to do
                }
            })
        }
    }

}
