package io.selva.Higginbothams.Higginbothams.Repository;

import io.selva.Higginbothams.Higginbothams.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {

}
