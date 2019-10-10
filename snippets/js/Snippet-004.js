import {Accounts, AccountsScreen, iconsBlock, MainScreen} from './lib/mock-library';

class View {
    constructor(parentView) {
        this.parentView = parentView;
    }

    refreshIconNotification () {
        // TODO funny thing to do just for displaying a badge
        if (this.parentView instanceof MainScreen || this.parentView instanceof AccountsScreen) {
            iconsBlock.setNotification("", 4)
        } else {
            Accounts.getInstance().getAllAccountsList(() => () => new class extends Accounts.GetAccountsCalback {
                onSuccess (result) {
                    for (const accountList of result) {
                        if (!accountList.isAlreadyDiscovered()) {
                            iconsBlock.setNotification(" ", 4);
                            return;
                        }
                    }
                    iconsBlock.setNotification("", 4); // Reinit
                }

                onFailure(error) {
                    // Nothing to do
                }
            }())
        }
    }

}