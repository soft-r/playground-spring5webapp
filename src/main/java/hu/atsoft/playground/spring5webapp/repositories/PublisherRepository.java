package hu.atsoft.playground.spring5webapp.repositories;

import hu.atsoft.playground.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
