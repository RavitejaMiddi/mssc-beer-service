package com.sfw.msscbeerservice.repository;

import com.sfw.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
