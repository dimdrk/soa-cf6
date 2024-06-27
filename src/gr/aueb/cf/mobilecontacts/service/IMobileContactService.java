package gr.aueb.cf.mobilecontacts.service;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.model.MobileContact;

public interface IMobileContactService {
    MobileContact insertMobileContact(MobileContactInsertDTO dto);
}
