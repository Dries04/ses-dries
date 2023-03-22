package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void Test_juist_optellen(){
            var main = new Main(5,8);
        Assertions.assertEquals(13, main.Calculator());
    }

    @Test
    public void Test_negatiefGetal(){
            var main = new Main(-2,5);
            Assertions.assertEquals(3, main.Calculator());
    }
}