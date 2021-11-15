package com.msemail.email.application.ports;

import com.msemail.email.application.domain.Email;

public interface SendEmailServicePort {

    void sendEmailSmtp(Email email);
}
