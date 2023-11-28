package com.getdata.restcall_test1.Repository;

import com.getdata.restcall_test1.Entity.Books;
import java.util.List;
import com.getdata.restcall_test1.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AuthorRepo extends JpaRepository<Author, String> {

    @Query("SELECT b FROM Books b WHERE b.author.AuthorID = :authorId")
    List<Books> findBooksByAuthorID(@Param("authorId") String authorId);
}