package com.example.libraryproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthorController {

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String getAllAuthors() {
        // Logic to retrieve and return all authors
    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.GET)
    public String getAuthorById(@PathVariable("id") Long id) {
        // Logic to retrieve and return an author by ID
    }

    @RequestMapping(value = "/authors", method = RequestMethod.POST)
    public String createAuthor() {
        // Logic to create a new author
    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.PUT)
    public String updateAuthor(@PathVariable("id") Long id) {
        // Logic to update an author
    }

    @RequestMapping(value = "/authors/{id}", method = RequestMethod.DELETE)
    public String deleteAuthor(@PathVariable("id") Long id) {
        // Logic to delete an author
    }
}

