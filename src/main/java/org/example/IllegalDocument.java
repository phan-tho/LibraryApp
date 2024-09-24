package org.example;

public class IllegalDocument extends  Exception {
    /**
     * Constructor with error message
     * @param message Error message
     */
    public IllegalDocument(String message) {
        super(message);
    }

    /**
     * Default Constructor
     */
    public IllegalDocument() {
        super("Illegal document");
    }
}
