package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
   @Test
    public void rest() {
        RestService service = new RestService();
        int expected = 3;
        int actual = service.calculate (10000 , 3000,20000 );
        Assertions.assertEquals(expected, actual);
    }

}