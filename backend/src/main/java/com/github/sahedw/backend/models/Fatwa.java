package com.github.sahedw.backend.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Fatwa {

    String id;

    String title;

    String arabicTitle;

    String quranReference;

    String description;

    Kitab kitab;

    List<String> footnotes;

}
