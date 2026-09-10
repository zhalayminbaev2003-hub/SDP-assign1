public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();
        
        EmailObjectBuilder objBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objBuilder);
        EmailMessage welcomeEmail = objBuilder.getResult(); 
        System.out.println(welcomeEmail);
        
        System.out.println("\n--------------------------\n");

        EmailTextBuilder textBuilder = new EmailTextBuilder();
        director.makeWelcomeEmail(textBuilder);
        String draftPreview = textBuilder.getResult(); 
        System.out.println(draftPreview);
    }
}