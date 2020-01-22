import java.util.List;

import static java.util.Collections.emptyList;

class Snippet_005 {

    private Integer DANGEROUS_ACTION = 1;

    /**
     * Execute the action when the user is connected.
     */
    public void executeActionIfStateIsNotForbidden(Integer action) {
        if (action.equals(DANGEROUS_ACTION)) {
            Boolean isConnected = getUserState();
            getContactMails(isConnected);
        } else {
            System.out.println("Action is not allowed");
        }
    }

    /**
     * Get the list of the contact of the user.
     */
    public void getContactMails(Boolean connected) {
        if (connected.equals(true)) {
            writeMailToContact(getContacts());
        } else {
            System.out.println("Not connected");
        }
    }

    /**
     * Write an email to the friends.
     */
    public void writeMailToContact(List<Contact> arg) {
        if (!arg.isEmpty()) {
            for (Contact contact : arg) {
                smtp(contact.courriel, "Some important information to send!");
            }
        } else {
            System.out.println("arg is empty");
        }
    }

    static class Contact {
        public String courriel;

        public Contact(String courriel) {
            this.courriel = courriel;
        }

    }

    private static Boolean getUserState() {
        //TODO("Not important for exercise")
        return false;
    }

    private static List<Contact> getContacts() {
        //TODO("Not important for exercise")
        return emptyList();
    }

    private static void smtp(String adress, String message) {
        //TODO("Not important for exercise")
    }
}