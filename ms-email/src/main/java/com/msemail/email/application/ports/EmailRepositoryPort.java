package com.msemail.email.application.ports;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.msemail.email.application.domain.Email;
import com.msemail.email.application.domain.PageInfo;

public interface EmailRepositoryPort {

    Email save(Email email);
    List<Email> findAll(PageInfo pageInfo);
    Optional<Email> findById(UUID emailId);
}
