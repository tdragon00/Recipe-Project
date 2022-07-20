package com.example.ReipceProject.repositories;

import com.example.ReipceProject.Domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
