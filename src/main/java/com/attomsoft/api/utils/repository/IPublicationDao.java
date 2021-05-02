package com.attomsoft.api.utils.repository;

import com.attomsoft.api.utils.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublicationDao extends JpaRepository< Publication, Long > {
}
