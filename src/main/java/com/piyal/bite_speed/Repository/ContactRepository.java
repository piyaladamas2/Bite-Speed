package com.piyal.bite_speed.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.piyal.bite_speed.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

  List<Contact> findByPhoneNumberOrEmail(String phoneNumber, String email);

  List<Contact> findByLinkedId(Long linkedId);
}
