public class EmailObjectBuilder implements EmailBuilder {
    private String to;
    private String subject;
    private String body;

    @Override
    public EmailObjectBuilder setTo(String to) { this.to = to; return this; }
    
    @Override
    public EmailObjectBuilder setSubject(String subject) { this.subject = subject; return this; }
    
    @Override
    public EmailObjectBuilder setBody(String body) { this.body = body; return this; }

    public EmailMessage getResult() {
        if (to == null || to.trim().isEmpty()) {
            throw new IllegalStateException("Validation Error: 'To' address is required to build an email.");
        }
        return new EmailMessage(to, subject, body);
    }
}