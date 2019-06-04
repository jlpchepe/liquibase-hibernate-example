package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Article;
import repositories.ItemRepository;

/**
* 
* @author jpena
* @created 30 may. 2019 18:41:32
*/
@RestController("item")
public class ItemController {
    public ItemController(
        ItemRepository repository
    ) {
        this.repository = repository;
    }

    private final ItemRepository repository;

    @GetMapping()
    public Iterable<Article> get() {
        return this.repository.findAll();
    }
}
