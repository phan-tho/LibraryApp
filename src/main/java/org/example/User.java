package org.example;

//class NodeDoc {
//    Document document;
//    NodeDoc next;
//
//    LocalDate borrowedDate;
//    int numberOfDocs;
//
//    NodeDoc(Document document) {
//        this.document = document;
//        this.next = null;
//        this.borrowedDate = LocalDate.now();
//        this.numberOfDocs = 0;
//    }
//
//    NodeDoc(Document document, int numberOfDocs, LocalDate borrowedDate) {
//        this.document = document;
//        this.next = null;
//        this.borrowedDate = borrowedDate;
//        this.numberOfDocs = numberOfDocs;
//    }
//}
//
//class ListDocs {
//    NodeDoc head;
//
//    ListDocs(NodeDoc head) {
//        this.head = head;
//    }
//    ListDocs() {
//        this.head = null;
//    }
//
//    public void addDocument(NodeDoc document) {
//        document.next = head;
//        head = document;
//    }
//}

public class User {
    private String name;
    private Document[] borrowedDocuments;

    User(String name, Document borrowedDocuments) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document[] getBorrowedDocuments() {
        return borrowedDocuments;
    }

    public void setBorrowedDocuments(Document[] borrowedDocuments) {
        this.borrowedDocuments = borrowedDocuments;
    }
}
