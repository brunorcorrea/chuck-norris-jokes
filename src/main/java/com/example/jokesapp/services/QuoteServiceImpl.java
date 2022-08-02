package com.example.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final ChuckNorrisQuotes chuck;

    public QuoteServiceImpl() {
        this.chuck = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuck.getRandomQuote();
    }
}
