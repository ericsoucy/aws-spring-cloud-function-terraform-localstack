package com.example.awscloudfunction;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class ExampleSupplier implements Supplier<MyPojo> {

    @Override
    public MyPojo get() {
        return new MyPojo("Example Data");
    }
}
