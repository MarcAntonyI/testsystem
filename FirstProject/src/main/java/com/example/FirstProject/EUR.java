package com.example.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class EUR implements Currency{
    public String getRate(){
        return "EUR-RUB - 100";
    }
}
