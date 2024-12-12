package com.guitartune.project_wahyudi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitartune.project_wahyudi.models.Category;

public interface CategoryRepository extends JpaRepository<Category,String>{
    Category findCategoryByCategoryName(String categoryName);
}
