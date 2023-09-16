package com.github.sahedw.backend.models;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FatwaService {

    private final FatwaRepo fatwaRepo;

    public List<Fatwa> getAllFatwas() {
        return fatwaRepo.findAll();
    }
}
