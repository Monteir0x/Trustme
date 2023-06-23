package com.example.trustme.repositories;

import com.example.trustme.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ActivityRepository extends JpaRepository<Activity, String> {
}
