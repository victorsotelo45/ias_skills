package com.airplane.demo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TiquetRepository extends JpaRepository<Tiquet, Long> {
}