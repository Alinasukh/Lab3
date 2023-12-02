package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTesterTest {

    @org.junit.jupiter.api.Test
    void testArrayList() {
        PerformanceTester performanceTester = new PerformanceTester();
        performanceTester.testArrayList();
    }

    @org.junit.jupiter.api.Test
    void testLinkedList() {
        PerformanceTester performanceTester = new PerformanceTester();
        performanceTester.testLinkedList();
    }
}