package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Article;

/**
* 
* @author jpena
* @created 30 may. 2019 18:53:27
*/
@Repository
public interface ItemRepository extends CrudRepository<Article, Long> {
}