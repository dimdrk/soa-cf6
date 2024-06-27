package gr.aueb.cf.mobilecontacts.service.exceptions;

import gr.aueb.cf.mobilecontacts.model.MobileContact;

public class UseridAlreadyExistsException extends Exception {
    private final static long serialVersionUID = 1L;

    public UseridAlreadyExistsException(MobileContact mobileContact) {
        super("User with id: " + mobileContact.getId() + " already exists.");
    }
}
