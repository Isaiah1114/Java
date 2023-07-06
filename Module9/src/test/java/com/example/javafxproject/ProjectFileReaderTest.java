package com.example.javafxproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProjectFileReaderTest {

    @Test
    void wordCounter() throws IOException {
        ProjectFileReader pfr = new ProjectFileReader();
        assertEquals(pfr.testint , 5);
        String t = pfr.wordCounter();
    }


}