package pl.softsystem.books.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByOrderByTitle();

    List<Book> findByTitleContainingIgnoreCaseOrGenreContainingIgnoreCaseOrAuthorsLastNameContainingIgnoreCase(String title, String genre, String authorLastName);

    Book findBySignaturesContaining(Signature signature);
}
