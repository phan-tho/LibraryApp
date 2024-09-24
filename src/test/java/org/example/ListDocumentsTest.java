package org.example;


import org.junit.Before;
import org.junit.Test;

public class ListDocumentsTest{
    private ListDocuments listDocuments;

    @Before
    public void setUp() {
        listDocuments = new ListDocuments();
    }

    @Test
    public void testInsert() {
        listDocuments.insert(new Document("Hello World", "Test jav"));
    }

    @Test
    public void testRemove() {
        listDocuments.remove(new Document("Hello World", "Test jav"));
    }
}