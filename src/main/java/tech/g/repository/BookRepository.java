package tech.g.repository;

import org.springframework.data.repository.CrudRepository;

import tech.g.bo.BookBO;

public interface BookRepository extends CrudRepository<BookBO, Long> {

}
