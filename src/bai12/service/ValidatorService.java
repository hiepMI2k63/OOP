package bai12.service;

import java.time.LocalDate;

import bai12.exception.YearMadeException;

public class ValidatorService {
    public static void madeYear( LocalDate madeYear) throws YearMadeException {
       throw new YearMadeException(" exception made year day"); 
    }
}
