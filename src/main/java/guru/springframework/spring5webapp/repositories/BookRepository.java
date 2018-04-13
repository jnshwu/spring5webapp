package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jinshiwu on 4/12/18.
 */
public interface BookRepository extends CrudRepository<Book, Long>{
}
