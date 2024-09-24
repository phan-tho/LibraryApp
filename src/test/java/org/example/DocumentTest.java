package org.example;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class DocumentTest {
    private Document document;

    @Before
    public void setUp() {
        document = new Document("Test", "Test");
    }

    @Test
    public void testIsSmallerThan1() {
        assertTrue(document.isSmallerThan(new Document("Zest", "Test")));
    }

    @Test
    public void testIsSmallerThan2() {
        assertTrue(document.isSmallerThan(new Document("Test", "Zest")));
    }

    @Test
    public void testIsSmallerThan3() {
        assertFalse(document.isSmallerThan(new Document("Meet", "Test")));
    }
}