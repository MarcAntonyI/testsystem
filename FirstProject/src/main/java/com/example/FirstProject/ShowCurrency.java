package com.example.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShowCurrency {
   private Currency currencyUSD;
   private Currency currencyEUR;
   private Currency currencyTEN;

   @Value("${value.date}")
   private String date;

   @Autowired
   public ShowCurrency(@Qualifier("USD") Currency currencyUSD,
                       @Qualifier("EUR") Currency currencyEUR,
                       @Qualifier("TEN")Currency currencyTEN){
       this.currencyUSD = currencyUSD;
       this.currencyEUR = currencyEUR;
       this.currencyTEN = currencyTEN;
   }
   public void getCurrency(){
       System.out.println("Currency" + "\n"+ currencyUSD.getRate() + "\n" + currencyEUR.getRate() + "\n" + currencyTEN.getRate());
   }
   public String getDate(){
       return date;
   }
}
