package br.com.alura.languages.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> GetLanguageList() {
        var languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Language PostLanguage(@RequestBody Language language) {

        repository.save(language);
        return language;
    }

}
