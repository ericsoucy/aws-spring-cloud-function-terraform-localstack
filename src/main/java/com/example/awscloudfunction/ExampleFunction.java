package com.example.awscloudfunction;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExampleFunction implements Function<MyPojo, String> {

    @Override
    public String apply(MyPojo myPojo) {
        // Do something in your lambda function here
        return myPojo.getExampleField().toUpperCase();
    }

    /*@Data
    public class MyPojo {
        private String exampleField;
    }*/
}
