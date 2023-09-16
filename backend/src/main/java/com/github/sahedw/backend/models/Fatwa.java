package com.github.sahedw.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("fatwas")
public class Fatwa {

    @Id
    private String id;

    private String title;

    private String arabicTitle;

    private String quranReference;

    private String description;

    private Kitab kitab;

    private List<String> footnotes;

}
