package com.github.sahedw.backend.controllers;

import com.github.sahedw.backend.models.Fatwa;
import com.github.sahedw.backend.models.FatwaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fatwa")
public class FatwaController {

    private final FatwaService fatwaService;

    public FatwaController(FatwaService fatwaService) {
        this.fatwaService = fatwaService;
    }

    @GetMapping
    public List<Fatwa> all() {
        return fatwaService.getAllFatwas();
    }
}
