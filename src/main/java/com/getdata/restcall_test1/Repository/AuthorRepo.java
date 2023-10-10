package com.getdata.restcall_test1.Repository;


import com.getdata.restcall_test1.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, String> {
}