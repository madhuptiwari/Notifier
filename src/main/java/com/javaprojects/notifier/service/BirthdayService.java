package com.javaprojects.notifier.service;

import com.javaprojects.notifier.model.Employee;
import com.javaprojects.notifier.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BirthdayService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmailService emailService;

    public void sendBirthdayEmails() {
        LocalDate today = LocalDate.now();
        List<Employee> employees = employeeRepository.findByBirthday(today);

        for (Employee employee : employees) {
            emailService.sendBirthdayEmail(employee);
        }
    }
}

