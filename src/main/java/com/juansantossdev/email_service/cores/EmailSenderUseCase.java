package com.juansantossdev.email_service.cores;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
}
