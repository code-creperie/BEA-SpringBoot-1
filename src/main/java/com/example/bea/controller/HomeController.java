package com.example.bea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Book Exchange Application");
        model.addAttribute("subtitle", " A Place to Share Books and Discover New Ones");
        model.addAttribute("description",
                "📖 Welcome to BEA, a friendly space where anyone can lend a book, borrow one, or just browse around.\n\nWe believe that books are better when they’re shared—and that stories are made to travel. Whether you’re passing along a favorite novel, a dusty old textbook, or that one weird memoir you can't stop thinking about, BEA helps it find a new reader.\n\nWe’re not a bookstore or a library—we’re a little bit of both, powered by people.");

        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Book Exchange Application");
        model.addAttribute("subtitle", "About This Project");
        model.addAttribute("description",
                "BEA was created to make it easier for people to share books with others in their community. Think of it as a digital book-sharing shelf: one where you can leave a book you love, take one you’re curious about, or just see what others are reading. No fees, no accounts, just stories moving from hand to hand. It’s simple, honest, and a little nerdy. But we like it that way.");
        model.addAttribute("author", "Developed by people who still dog-ear pages (sorry, librarians)");
        return "home/about";
    }

}
