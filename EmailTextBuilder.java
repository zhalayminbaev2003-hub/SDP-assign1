public class EmailTextBuilder implements EmailBuilder {
    private final StringBuilder sb = new StringBuilder("-- Email Draft Preview --\n");
    private boolean hasTo = false;

@Override
public EmailTextBuilder setTo(String to) {
    sb.append("To:      ").append(to).append("\n");
    this.hasTo = true;
    return this;
}

@Override
public EmailTextBuilder setSubject(String subject) {
    sb.append("Subject: ").append(subject).append("\n");
    return this;
}

@Override
public EmailTextBuilder setBody(String body) {
    sb.append("Body:    ").append(body).append("\n");
    return this;
}
    public String getResult() { 
        if (!hasTo) {
            throw new IllegalStateException("Validation Error: 'To' address is missing in the text draft.");
        }
        return sb.toString(); 
    }
}