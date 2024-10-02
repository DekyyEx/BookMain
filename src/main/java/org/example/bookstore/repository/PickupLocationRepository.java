package org.example.bookstore.repository;

import org.example.bookstore.model.PickupLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickupLocationRepository extends JpaRepository<PickupLocation, Long> {
}
