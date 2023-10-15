package com.ohgiraffers.practicespringdatajpa.tour.repository;

import com.ohgiraffers.practicespringdatajpa.tour.entity.TourInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<TourInfo, Integer> {



}
