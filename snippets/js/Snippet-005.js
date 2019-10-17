import {getUserState, getContacts, smtp} from './lib/mock-library'

const DANGEROUS_ACTION = 1;

/**
 * Execute the action when the user is connected.
 */
function executeActionIfStateIsNotForbidden(action) {
  if(action === DANGEROUS_ACTION){
    let isConnected = getUserState()
    getContactMails(isConnected)
  } else {
    console.log("Action is not allowed")
  }
}

/**
 * Get the list of the contact of the user.
 */
function getContactMails(connected) {
  if(connected === true){
    writeMailToContact(getContacts())
  } else {
    console.log("Not connected")
  }
}

/**
 * Write an email to the friends.
 */
function writeMailToContact(arg) {
  if(arg.length > 0) {
    for (let contact of arg) {
      smtp(contact.courriel, "Some important information to send!")
    }
  } else {
    console.log("arg is empty")
  }
}

