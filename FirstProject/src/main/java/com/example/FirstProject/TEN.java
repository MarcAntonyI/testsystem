package com.example.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class TEN implements Currency{
    public String getRate(){
        return "TEN-RUB - 0.5";
    }
}
