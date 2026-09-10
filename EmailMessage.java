public class EmailMessage {
    private final String to;
    private final String subject;
    private final String body;

    EmailMessage(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override 
    public String toString() {
        return "EmailMessage[to=" + to + ", subject=" + subject + ", body=" + body + "]";
    }
}