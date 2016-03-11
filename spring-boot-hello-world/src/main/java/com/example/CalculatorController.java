package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by suat on 10.03.2016.
 */

    @RestController
    public class CalculatorController {
    int sayi;
    @RequestMapping(value="/api/calculator/{number}",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public int getNumber(@PathVariable int number){
        return number;
    }
        public Calculate index() {
           // return new Calculate( 7, sayi );

        }
    }

