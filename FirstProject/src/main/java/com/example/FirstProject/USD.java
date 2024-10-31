package com.example.FirstProject;

import org.springframework.stereotype.Component;
@Component
public class USD implements Currency{
    public String getRate(){
        return "USD-RUB - 90";
    }
}
