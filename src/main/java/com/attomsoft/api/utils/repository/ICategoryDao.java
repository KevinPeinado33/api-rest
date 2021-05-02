package com.attomsoft.api.utils.repository;

import com.attomsoft.api.utils.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository< Category, Long > {
}
