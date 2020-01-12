package hu.atsoft.playground.spring5webapp.repositories;

import hu.atsoft.playground.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
