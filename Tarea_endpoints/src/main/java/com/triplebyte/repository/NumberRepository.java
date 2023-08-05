package com.triplebyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.triplebyte.models.Number;

public interface NumberRepository extends JpaRepository<Number, Long> {

}
