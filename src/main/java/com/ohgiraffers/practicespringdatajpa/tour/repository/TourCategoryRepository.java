package com.ohgiraffers.practicespringdatajpa.tour.repository;

import com.ohgiraffers.practicespringdatajpa.tour.entity.TourCategorySort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourCategoryRepository extends JpaRepository<TourCategorySort, Integer> {
}
