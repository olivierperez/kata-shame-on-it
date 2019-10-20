import java.util.List;

class View {
    private Screen parentView;
    private IconBlock iconsBlock;

    public View(Screen parentView) {
        this.parentView = parentView;
    }

    public void refreshIconNotification() {
        // TODO funny thing to do just for displaying a badge
        if (parentView instanceof MainScreen || parentView instanceof AccountsScreen) {
            iconsBlock.setNotification("", 4);
        } else {
            Accounts.getInstance().getAllAccountsList(new Accounts.GetAccountsCalback<>() {
                @Override
                public void onSuccess(List<AccountListObject> result) {
                    for (AccountListObject accountList : result) {
                        if (!accountList.isAlreadyDiscovered()) {
                            iconsBlock.setNotification(" ", 4);
                            return;
                        }
                    }
                    iconsBlock.setNotification("", 4); // Reinit
                }

                @Override
                public void onFailure(Throwable error) {
                    // Nothing to do
                }
            });
        }
    }

}

interface Screen {
}

class MainScreen implements Screen {
}

class AccountsScreen implements Screen {
}

class IconBlock {
    void setNotification(String title, Integer index) {
        // TODO("Not important for exercise")
    }
}

class Accounts {
    void getAllAccountsList(GetAccountsCalback<AccountListObject> callback) {

    }

    interface GetAccountsCalback<T> {
        void onSuccess(List<AccountListObject> result);

        void onFailure(Throwable error);
    }

    static Accounts getInstance() {
        // TODO("Not important for exercise")
        return null;
    }
}

class AccountListObject {
    Boolean isAlreadyDiscovered() {
        // TODO("Not important for exercise")
        return false;
    }
}
