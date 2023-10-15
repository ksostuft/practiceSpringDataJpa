package com.ohgiraffers.practicespringdatajpa.tour.repository;

import com.ohgiraffers.practicespringdatajpa.tour.entity.TourInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository<TourInfo, Integer> {


    List<TourInfo> findByTourTitleContaining(String tourTitle);
}
