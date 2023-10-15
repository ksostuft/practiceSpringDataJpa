package com.ohgiraffers.practicespringdatajpa.tour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tour_category_sort")
public class TourCategorySort {

    @Id
    @Column(name = "tour_cate_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourSortCode;

    @Column(name = "tour_category_name")
    private String tourCategoryName;

    protected TourCategorySort() {
    }

    public TourCategorySort(int tourSortCode, String tourCategoryName) {
        this.tourSortCode = tourSortCode;
        this.tourCategoryName = tourCategoryName;
    }

    public int getTourSortCode() {
        return tourSortCode;
    }

    public String getTourCategoryName() {
        return tourCategoryName;
    }

    @Override
    public String toString() {
        return "TourCategorySort{" +
                "tourSortCode=" + tourSortCode +
                ", tourCategoryName='" + tourCategoryName + '\'' +
                '}';
    }
}
