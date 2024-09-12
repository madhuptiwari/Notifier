package com.javaprojects.notifier.service;

import com.javaprojects.notifier.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendBirthdayEmail(Employee employee) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(employee.getEmail());
        message.setSubject("Happy Birthday!");
        message.setText("Dear " + employee.getName() + ",\n\nWishing you a very Happy Birthday!\n\nBest Regards,\nYour Company");

        mailSender.send(message);
    }
}

