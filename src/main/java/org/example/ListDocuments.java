package org.example;

class NodeDoc {
    Document document;
    NodeDoc leftChild, rightChild;

    NodeDoc(Document document) {
        this.document = document;
        leftChild = null;
        rightChild = null;
    }
}

public class ListDocuments {
    // Binary Search Tree
    NodeDoc root;
    public ListDocuments() {
        root = null;
    }

    /**
     * Add new document to tree.
     * Compare new document with parent NodeDoc by method .isSmallerThan(other)
     * @param document document need add to tree
     */
    public void insert(Document document) {
        NodeDoc newNodeDoc = new NodeDoc(document);
        if (root == null) {
            root = newNodeDoc;
        } else {
            NodeDoc currentNode = root;
            while (currentNode != null) {
                if (currentNode.document.isSmallerThan(document)) {
                    currentNode = currentNode.rightChild;
                } else{
                    currentNode = currentNode.leftChild;
                }
            }
            currentNode = newNodeDoc;
        }
    }

    /**
     * Remove specific document from Binary Search Tree
     * @param document Need to remove
     */
    public void remove(Document document) {
        // Your code here
        NodeDoc currentNode = root;
        while (currentNode != null) {
            if (currentNode.document.isEqual(document)) {
                if (currentNode.leftChild == null) {
                    currentNode = currentNode.rightChild;
                    return;
                } else if (currentNode.rightChild == null) {
                    currentNode = currentNode.leftChild;
                    return;
                }

                NodeDoc successorNode = getSuccessor(currentNode);
                successorNode.document.copyTo(currentNode.document);
                successorNode = null;

            } else if (currentNode.document.isSmallerThan(document)) {
                currentNode = currentNode.rightChild;
            } else {
                currentNode = currentNode.leftChild;
            }

        }
    }

    /**
     * Get Successor for currentNode
     * @param currentNode need find successor
     * @return successor
     */
    private NodeDoc getSuccessor(NodeDoc currentNode) {
        currentNode = currentNode.rightChild;
        while (currentNode != null && currentNode.leftChild != null) {
            currentNode = currentNode.leftChild;
        }
        return currentNode;
    }


    /**
     * Find Document
     * @param document document need to find
     * @return Node Document
     * @throws IllegalDocument if this document does not exist
     */
    public NodeDoc finDocument(Document document) throws IllegalDocument {
        NodeDoc currentNode = root;
        while (currentNode != null) {
            if (currentNode.document.isEqual(document)) {
                return currentNode;
            } else if (currentNode.document.isSmallerThan(document)) {
                currentNode = currentNode.rightChild;
            } else {
                currentNode = currentNode.leftChild;
            }
        }
        throw new IllegalDocument("This document does not exist");
    }
}
