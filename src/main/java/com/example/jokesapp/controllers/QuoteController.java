package com.example.jokesapp.controllers;

import com.example.jokesapp.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService =  quoteService;
    }

    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model) {
        model.addAttribute("joke", quoteService.getRandomQuote());
        return "index";
    }
}
