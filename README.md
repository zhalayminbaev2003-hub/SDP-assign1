 Assignment 1: Builder Pattern
 
I implemented the Builder pattern to create and format emails. 

 Project structure
* `EmailMessage.java` — the final object[cite: 1]
* `EmailBuilder.java` — interface with basic steps (`setTo`, `setSubject`, `setBody`)[cite: 1]
* `EmailObjectBuilder.java` — builds a real Java object[cite: 1]
* `EmailTextBuilder.java` — builds a text draft preview[cite: 1]
* `EmailDirector.java` — manages email templates (`makeWelcomeEmail`, `makeSystemAlert`)[cite: 1]
* `Main.java` — runs the code and shows output[cite: 1]

 Features
* Uses method chaining (`return this;`)[cite: 1]
* Checks if the recipient is empty before building (`Fail Fast`)[cite: 1]
* The email object is immutable (read-only)[cite: 1]

