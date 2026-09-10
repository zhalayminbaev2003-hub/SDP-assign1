public class EmailDirector {
    
    public void makeWelcomeEmail(EmailBuilder b) {
        b.setTo("islambek@gmail.com")
         .setSubject("Welcome to Our Service!")
         .setBody("Hello! We are excited to have you on board.");
    }

    public void makeSystemAlert(EmailBuilder b) {
        b.setTo("admin@example.com")
         .setSubject("URGENT: System Outage")
         .setBody("The main database server is currently down. Please investigate immediately.");
    }
}