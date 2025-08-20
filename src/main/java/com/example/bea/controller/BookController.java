package com.example.bea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {
private static final List<Map<String, String>> books = List.of(
        Map.of(
            "id", "1",
            "name", "Modern Web Engineering with Spring Boot: Build Robust Java-Based Web Applications Using MVC Architecture and Engineering Principles",
            "description", "This book written by Raúl Mazo and Gabriel Camargo guides developers on building robust, Java-based web applications with the Spring Boot framework. You will learn to engineer solutions that are scalable, maintainable, and will not wake you up with a server alert at 3 AM."
        ),
        Map.of(
            "id", "2",
            "name", "Mastering Web Architecture with Laravel: Professional Development with MVC Patterns and Modern Engineering Principles",
            "description", "This book written by Raúl Mazo and Gabriel Camargo details how to master web architecture for professional development using the Laravel framework. It is your chance to build applications with the elegance Laravel promises, backed by the solid engineering that prevents them from becoming a beautiful mess."
        ),
        Map.of(
            "id", "3",
            "name", "Engineering Modern Web Apps with Next.js: Full-Stack Architecture with Modern Patterns and Engineering Principles for React Developers",
            "description", "This book written by Raúl Mazo and Gabriel Camargo serves as a guide for React developers on engineering full-stack web applications with Next.js. Now you will be able to build powerful full-stack apps without getting lost in a jungle of configuration files!"
        ),
        Map.of(
            "id", "4",
            "name", "Inteligencia Artificial Simbólica: De la Lógica al Razonamiento Automatizado",
            "description", "This book written in Spanish by Raúl Mazo traces the path of symbolic AI, from its foundations in formal logic to the development of automated reasoning systems. It’s a comprehensive guide to building intelligent agents that actually understand the rules before they play the game."
        )
    );

    @GetMapping("/books")
    public String index(Model model) {
        model.addAttribute("title", "Books - Book Exchange Application");
        model.addAttribute("subtitle", "List of Books");
        model.addAttribute("books", books);
        return "book/index";
    }

    @GetMapping("/books/{id}")
    public String show(@PathVariable String id, Model model) {
        int idx = Integer.parseInt(id) - 1;
        Map<String, String> book = books.get(idx);

        model.addAttribute("title", book.get("name") + " - Book Exchange Application");
        model.addAttribute("subtitle", book.get("name") + " - Book Information");
        model.addAttribute("book", book);

        return "book/show";
    }
}
