# Notifier
- 🎂Employee Birthday Tracking and Email Sender Application📧
- A Java Spring Boot application that tracks employee birthdays and automatically sends birthday greetings via email. The system checks daily for employees whose birthday matches the current date and sends them a personalized greeting.
  
<b> Project Structure </b>

The project follows the MVC (Model-View-Controller) architecture with a Service layer for business logic and Repository for database interaction.

Model: Represents the Employee entity.
Repository: Interacts with the database to fetch Employee data.
Service: Contains the business logic for sending birthday emails.
Scheduler: Runs daily to check for employee birthdays.
