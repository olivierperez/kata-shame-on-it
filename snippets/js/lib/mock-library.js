export class MainScreen {}

export class AccountsScreen {}

export const iconsBlock = {
    setNotification(a, b) {}
}

export const Accounts = {
    getInstance () {
        return Accounts;
    },

    getAllAccountsList (callback) {},

    GetAccountsCalback: class GetAccountsCalback {
        onSuccess(){}
        onFailure(){}
    },
}

// lib--005.js
export function getUserState() {} // "Not important for exercise"
export function getContacts() {} // "Not important for exercise"
export function smtp(adress, message) {}// "Not important for exercise"
export class Contact {
    constructor ({courriel} = {}) {
        this.courriel = courriel;
    }
}
