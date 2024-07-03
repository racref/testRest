package com.api.test.repository;

import com.api.test.entity.NamesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<NamesEntity, Long> {

}
