package com.shubham.testing.fauxspring;
import com.shubham.testing.model.PetType;

import java.text.ParseException;
import java.util.Locale;


public interface Formatter<T> {

    String print(PetType petType, Locale locale);

    PetType parse(String text, Locale locale) throws ParseException;
}
