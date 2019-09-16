package fr.o80.kata

/**
 * Execute the action when the user is connected.
 */
fun executeActionIfStateIsNotForbidden(action: Int) {
    if(action == ...){
        val isConnected = getUserState()
        getContactMails(isConnected)
    } else {
        println("Action is not allowed")
    }
}

/**
 * Get the list of the contact of the user.
 */
fun getContactMails(connected: Boolean) {
    if(connected == true){
        writeMailToContact(getContacts())
    } else {
        println(message)
    }
}

/**
 * Write an email to the friends.
 */
fun writeMailToContact(arg: List<Contact>) {
    if(arg.isNotEmpty()){
        for (contact: arg) {
            smtp(contact.courriel, "Some important information to send!")
        }
    } else {
        println(message)
    }
}
