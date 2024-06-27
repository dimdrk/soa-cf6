package gr.aueb.cf.mobilecontacts.service.exceptions;

import gr.aueb.cf.mobilecontacts.model.MobileContact;

public class UserIdAlreadyExistsException extends Exception {
    private final static long serialVersionUID = 1L;

    public UserIdAlreadyExistsException(MobileContact mobileContact) {
        super("User with id: " + mobileContact.getId() + " already exists.");
    }
}
