package ru.netology.sqr;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

   @ParameterizedTest
    @CsvSource(value={"minimumRange,99,99,0",
            "maximumRange, 10000,100,90",
            "partRange,200,100,5"
    })
     void sqrCeil( String testName, int max,int min,int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCeil (max,min);

        assertEquals(expected,actual);
    }
}