package com.juansantossdev.email_service.cores;

public record EmailRequest(String to, String subject, String body) {
}
