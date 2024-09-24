package org.example;

public class Document {
    private String title;
    private String description;

    Document(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Copy these properties to target
     * @throws NullPointerException when target is null
     */
    public void copyTo(Document target) {
        if (target == null) {
            throw new NullPointerException("target is null");
        }
        target.setTitle(title);
        target.setDescription(description);
    }

    /**
     * Compare 2 documents.
     * @param other compare this with other document
     * @return True when this document is smaller than other document.
     */
    public boolean isSmallerThan(Document other) {
        // Your code here

        return true;
    }

    /**
     * Compare 2 documents.
     * @param other compare this with other document
     * @return True when 2 documents are one
     */
    public boolean isEqual(Document other) {
        return this.title.equals(other.title);
    }
}
