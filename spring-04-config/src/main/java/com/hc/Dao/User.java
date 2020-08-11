package com.hc.Dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("qc")
    public String name="hc";

    public String getName() {
        return name;
    }
}
