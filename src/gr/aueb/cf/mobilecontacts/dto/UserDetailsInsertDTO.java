package gr.aueb.cf.mobilecontacts.dto;

import gr.aueb.cf.mobilecontacts.model.UserDetails;

public class UserDetailsInsertDTO extends BaseDTO {
    private String firstname;
    private String lastname;

    public UserDetailsInsertDTO() {

    }

    public UserDetailsInsertDTO(long id, String firstname, String lastname) {
        this.setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
