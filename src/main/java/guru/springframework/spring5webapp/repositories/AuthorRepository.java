package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jinshiwu on 4/12/18.
 */
public interface AuthorRepository  extends CrudRepository <Author, Long>{
}
