// Some help in "lib/Lib-005.kt"

private val DANGEROUS_ACTION = 1

/**
 * Execute the action when the user is connected.
 */
fun executeActionIfStateIsNotForbidden(action: Int) {
    if(action == DANGEROUS_ACTION){
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
        println("Not connected")
    }
}

/**
 * Write an email to the friends.
 */
fun writeMailToContact(arg: List<Contact>) {
    if(arg.isNotEmpty()){
        for (contact in arg) {
            smtp(contact.courriel, "Some important information to send!")
        }
    } else {
        println("arg is empty")
    }
}
